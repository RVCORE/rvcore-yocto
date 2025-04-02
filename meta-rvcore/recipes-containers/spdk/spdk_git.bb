SUMMARY = "Storage Performance Development Kit"
HOMEPAGE = "https://github.com/spdk/spdk"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7bbcbb10101b81c31700359b3b43a6ec"

SECTION = "devel"

DEPENDS = "cunit make-native meson-native procps-native ninja-native python3-pyelftools-native patchelf-native\
        numactl libpcap doxygen-native python3-sphinx-native libaio openssl json-c cmocka util-linux-libuuid \
        python3-magic python3-grpcio python3-grpcio-tools python3-configshell-fb python3-pexpect \
        ncurses python3 python3-pip meson python3-pyyaml nasm autoconf automake libtool help2man \
        systemtap fuse3 avahi mscgen drbd-utils \
        gcc make json-c  iscsi-initiator-utils \
        keyutils python3 python3-pip unzip patchelf \
        ninja meson python3-pyelftools valijson python3-magic python3-jinja2 \
        python3-configshell-fb python3-pexpect nasm autoconf automake libtool help2man \
        git lcov clang sg3-utils pciutils libabigail bash-completion ruby python3-pycodestyle python3-paramiko \
        doxygen mscgen graphviz avahi lz4 \
"
#drbd  libibverbs 
#libaccel-config-dev  g++  rake  abigail-tools  librdmacm-dev librados-dev 
#libexecinfo bundler  libnuma-dev  librbd-dev  uuid-dev 
#libpmem-dev libpmemblk-dev  libpmemobj-dev  astyle  shellcheck  libiscsi-dev

#inherit meson python3native 
inherit meson-routines pkgconfig 


SRC_URI = "gitsm://github.com/spdk/spdk.git;protocol=https;branch=master; \
            file://0001-fix-DPDK-build-for-riscv64.patch;patchdir=dpdk \
            file://0002-disable-ISAL-and-arc4random.patch \
            file://0003-fix-dpdk-build-for-riscv64-spdk-build.patch \
"

#           file://0001-add-riscv-cross-compile-configs-for-spdk.patch 
#           file://0002-fix-meson.get_cross_property-vendor_id.patch 


PV = "v24.11+git${SRCPV}"

SRCREV = "e01cb43b8578f9155d07a9bc6eee4e70a3af96b0"

S = "${WORKDIR}/git"
#B = "${S}"

def rust_tool(d, target_var):
    rustc = d.getVar('RUSTC')
    if not rustc:
        return ""
    cmd = [rustc, "--target", d.getVar(target_var)] + d.getVar("RUSTFLAGS").split()
    return "rust = %s" % repr(cmd)


addtask write_config before do_configure after do_patch
do_write_config[vardeps] += "CC CXX LD AR NM STRIP READELF CFLAGS CXXFLAGS LDFLAGS RUSTC RUSTFLAGS"
do_write_config() {
    # This needs to be Py to split the args into single-element lists
    cat >${WORKDIR}/meson.cross <<EOF
[binaries]
c = ${@meson_array('CC', d)}
cpp = ${@meson_array('CXX', d)}
cython = 'cython3'
ar = ${@meson_array('AR', d)}
nm = ${@meson_array('NM', d)}
strip = ${@meson_array('STRIP', d)}
readelf = ${@meson_array('READELF', d)}
objcopy = ${@meson_array('OBJCOPY', d)}
pkgconfig = 'pkg-config'
llvm-config = 'llvm-config'
cups-config = 'cups-config'
g-ir-scanner = '${STAGING_BINDIR}/g-ir-scanner-wrapper'
g-ir-compiler = '${STAGING_BINDIR}/g-ir-compiler-wrapper'
${@rust_tool(d, "HOST_SYS")}
${@"exe_wrapper = '${WORKDIR}/meson-qemuwrapper'" if d.getVar('EXEWRAPPER_ENABLED') == 'True' else ""}

#[properties]
#needs_exe_wrapper = true

[built-in options]
c_args = ${@meson_array('CFLAGS', d)}
c_link_args = ${@meson_array('LDFLAGS', d)}
cpp_args = ${@meson_array('CXXFLAGS', d)}
cpp_link_args = ${@meson_array('LDFLAGS', d)}

[host_machine]
system = '${@meson_operating_system('HOST_OS', d)}'
cpu_family = '${@meson_cpu_family('HOST_ARCH', d)}'
cpu = '${HOST_ARCH}'
endian = '${@meson_endian('HOST', d)}'

[target_machine]
system = '${@meson_operating_system('TARGET_OS', d)}'
cpu_family = '${@meson_cpu_family('TARGET_ARCH', d)}'
cpu = '${TARGET_ARCH}'
endian = '${@meson_endian('TARGET', d)}'
EOF

    cat >${WORKDIR}/meson.native <<EOF
[binaries]
c = ${@meson_array('BUILD_CC', d)}
cpp = ${@meson_array('BUILD_CXX', d)}
cython = 'cython3'
ar = ${@meson_array('BUILD_AR', d)}
nm = ${@meson_array('BUILD_NM', d)}
strip = ${@meson_array('BUILD_STRIP', d)}
readelf = ${@meson_array('BUILD_READELF', d)}
objcopy = ${@meson_array('BUILD_OBJCOPY', d)}
pkgconfig = 'pkg-config-native'
${@rust_tool(d, "BUILD_SYS")}

[built-in options]
c_args = ${@meson_array('BUILD_CFLAGS', d)}
c_link_args = ${@meson_array('BUILD_LDFLAGS', d)}
cpp_args = ${@meson_array('BUILD_CXXFLAGS', d)}
cpp_link_args = ${@meson_array('BUILD_LDFLAGS', d)}
EOF

    cp ${WORKDIR}/meson.native ${S}/dpdk/config/riscv/
    cp ${WORKDIR}/meson.cross  ${S}/dpdk/config/riscv/
}



do_configure() {

    cd ${S}
    ./configure --target-arch=rv64imafdc --cross-prefix=riscv64-oe-linux  --without-nvme-cuse 
#    meson setup --native-file dpdk/config/riscv/meson.native --cross-file dpdk/config/riscv/meson.cross dpdk dpdkbuild
#    meson build --cross-file dpdk/config/riscv/meson.cross
    #--with-shared
}


do_compile() {
    #overridden default CONFIG
    oe_runmake #CONFIG_ISAL=n CONFIG_HAVE_ARC4RANDOM=y
}

TARGET_CC_ARCH += "${LDFLAGS}"


do_install() {

    oe_runmake install DESTDIR=${D}

    sed -e '/SPDK_CONFIG_DPDK_DIR/d;/SPDK_CONFIG_ENV/d' ${D}${includedir}/spdk/config.h > ${D}${includedir}/spdk/config.h.tmp
    rm ${D}${includedir}/spdk/config.h
    mv ${D}${includedir}/spdk/config.h.tmp ${D}${includedir}/spdk/config.h

    #fix pkgconfig pc files path error on yocto
    rm -rf ${D}${libdir}/pkgconfig/*

    cd ${S}/build/lib/pkgconfig
    for i in $(find *.pc -type f); do
        sed -e 's/ -L.*lib/ -L\/usr\/lib/g' -e 's/ -I.*include/ -I\/usr\/include/g' $i > ${D}${libdir}/pkgconfig/$i
    done

    install -d ${D}${datadir}/${BPN}/examples
    install ${S}/build/examples/* ${D}${datadir}/${BPN}/examples

    #install -d ${D}${prefix}/scripts
    cp -r ${S}/scripts ${D}${prefix}/scripts

    rm -rf ${D}${libdir}/dpdk
    rm -rf ${D}${libdir}/python3.13
    rm -rf ${D}${datadir}/dpdk
    rm -rf ${D}${datadir}/doc
    rm -rf ${D}${bindir}/dpdk*
}

PACKAGES =+ "${PN}-examples ${PN}-scripts"

FILES:${PN}-examples = " \
    ${datadir}/${BPN}/examples/* \
"

FILES:${PN}-scripts = " \
    ${prefix}/scripts/* \
"

#RDEPENDS:spdk-examples = "spdk"
RDEPENDS:spdk-dev = "spdk-staticdev"
RDEPENDS:spdk-scripts = "bash python3"
