SUMMARY = "OpenZFS on Linux and FreeBSD"
DESCRIPTION = "OpenZFS on Linux and FreeBSD"
LICENSE = "CDDL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7087caaf1dc8a2856585619f4a787faa"
HOMEPAGE = "https://github.com/openzfs/zfs"

SRCREV = "4bd7a2eaa587cf2e408af020dddcfdc79f8d3431"
SRC_URI = "git://github.com/openzfs/zfs;protocol=https;branch=master \
		file://0001-fix-module-build-error.patch \
		file://0002-fix-infinite-recursion-error.patch \
"

#SRCREV = "1af41fd203639818aa28cc624f144ef604a166d8"
#SRC_URI = "git://github.com/openzfs/zfs;protocol=https;branch=zfs-2.3-release \
#"

#branch=zfs-2.3-release

# Using both 'module' and 'autotools' classes seems a bit odd, they both
# define a do_compile function.
# That's why we opt for module-base, also this prevents module splitting.
inherit module-base pkgconfig autotools bash-completion
#inherit module pkgconfig autotools bash-completion

DEPENDS = "virtual/kernel zlib util-linux libtirpc openssl curl"

PACKAGECONFIG ?= "${@bb.utils.filter('DISTRO_FEATURES', 'systemd sysvinit', d)} \
                  ${@bb.utils.filter('DISTRO_FEATURES', 'pam', d)} \
                 "

PACKAGECONFIG[pam] = "--enable-pam --with-pamconfigsdir=${datadir}/pam-configs --with-pammoduledir=${base_libdir}/security, --disable-pam"
PACKAGECONFIG[systemd] = "--enable-systemd,--disable-systemd,"
PACKAGECONFIG[sysvinit] = "--enable-sysvinit,--disable-sysvinit,"

EXTRA_OECONF:append = " \
    --disable-pyzfs \
    --with-linux=${STAGING_KERNEL_DIR} \
    --with-linux-obj=${STAGING_KERNEL_BUILDDIR} \
    --with-mounthelperdir=${base_sbin} \
    --with-udevdir=${base_libdir}/udev \
    --with-systemdunitdir=${systemd_system_unitdir} \
    --with-systemdgeneratordir=${nonarch_base_libdir}/systemd/system-generators \
    --with-systemdpresetdir=${nonarch_base_libdir}/systemd/system-preset \
    --with-systemdmodulesloaddir=${sysconfdir}/module-load.d \
    --without-dracutdir \
    --enable-debug \
"
# --enable-linux-builtin

# Reproducibility: Force target distribution ("vendor") to Debian to match
# default values for things like: NFS server service name, bash completion
# path, configuration files, ...
# The Debian values do match the OpenEmbedded ones.
#EXTRA_OECONF:append = " --with-vendor=debian"

EXTRA_OEMAKE:append = " \
    INSTALL_MOD_PATH=${D}${root_prefix} \
"

do_configure:append() {
	sed 's|source_module_dir|${S}/module|g' ${B}/module/Makefile > ${B}/module/Makefile.first
	sed 's|build_module_dir|${B}/module|g' ${B}/module/Makefile.first > ${B}/module/Makefile.second
	rm ${B}/module/Makefile ${B}/module/Makefile.first
	mv ${B}/module/Makefile.second ${B}/module/Makefile
}

do_compile:prepend() {
	cp ${B}/module/Kbuild ${S}/module/
}

do_install:prepend() {
	mkdir -p ${D}/usr/lib/modules/6.12.31-yocto-standard/kernel/fs/zfs
	cp ${S}/module/Module.symvers ${B}/module/
	cp ${S}/module/spl.ko ${D}/usr/lib/modules/6.12.31-yocto-standard/kernel/fs/zfs
	cp ${S}/module/zfs.ko ${D}/usr/lib/modules/6.12.31-yocto-standard/kernel/fs/zfs
}


do_install:append() {
    # /usr/share/zfs contains the zfs-tests folder which we do not need:
#    rm -rf ${D}${datadir}/zfs

    rm -rf ${D}${datadir}/initramfs-tools
}

FILES:${PN} += "\
    ${nonarch_base_libdir}/modules \
    ${systemd_system_unitdir} \
    ${nonarch_base_libdir}/systemd/system-generators \
    ${nonarch_base_libdir}/systemd/system-preset \
    ${sysconfdir}/modules-load.d/${BPN}.conf \
    ${sysconfdir}/default/${BPN} \
    ${sysconfdir}/sudoers.d/${BPN} \
    ${sysconfdir}/${BPN} \
    ${base_libdir}/udev \
    ${sbindir} \
    ${bindir} \
    ${libexecdir}/${BPN} \
    ${libdir} \
    ${datadir}/pam-configs \
    ${base_libdir}/security \
    ${datadir}/zfs/* \
    ${sysconfdir}/* \
"

FILES:${PN}-dev += "\
    ${prefix}/src/zfs-${PV} \
    ${prefix}/src/spl-${PV} \
"
# Not yet ported to rv32
COMPATIBLE_HOST:riscv32 = "null"
# conflicting definition of ABS macro from asm/asm.h from kernel
COMPATIBLE_HOST:mips = "null"
# FTBFS on aarch64 with 6.2+ kernel see https://github.com/openzfs/zfs/issues/14555
COMPATIBLE_HOST:aarch64 = "null"

INSANE_SKIP:${PN} += "buildpaths"
INSANE_SKIP:${PN}-dev += "buildpaths"
