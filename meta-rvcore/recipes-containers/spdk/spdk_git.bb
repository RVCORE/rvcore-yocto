SUMMARY = "Storage Performance Development Kit"
HOMEPAGE = "https://github.com/spdk/spdk"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1434d48e5407ec3ff55c979fa8bb273b"

SECTION = "devel"

DEPENDS = "cunit make-native meson-native procps-native ninja-native python3-pyelftools-native \
        numactl libpcap doxygen-native python3-sphinx-native libaio openssl json-c cmocka util-linux-libuuid \
        python3-magic python3-grpcio python3-grpcio-tools python3-configshell-fb python3-pexpect \
        ncurses python3 python3-pip meson python3-pyyaml nasm autoconf automake libtool help2man \
        systemtap fuse3 avahi mscgen drbd-utils"
#libexecinfo

#inherit meson python3native 
inherit meson-routines pkgconfig 


SRC_URI = "gitsm://github.com/spdk/spdk.git;protocol=https;branch=master; \
           file://0001-add-riscv-cross-compile-configs-for-spdk.patch \
           file://0002-fix-meson.get_cross_property-vendor_id.patch \
"


#PV = "v23.05+git${SRCPV}"

SRCREV = "30b534c9a8dbb558f08ddc2bc73475b458349467"

S = "${WORKDIR}/git"
#B = "${S}"

def rust_tool(d, target_var):
    rustc = d.getVar('RUSTC')
    if not rustc:
        return ""
    cmd = [rustc, "--target", d.getVar(target_var)] + d.getVar("RUSTFLAGS").split()
    return "rust = %s" % repr(cmd)


addtask write_config before do_configure
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

[built-in options]
c_args = ${@meson_array('CFLAGS', d)}
c_link_args = ${@meson_array('LDFLAGS', d)}
cpp_args = ${@meson_array('CXXFLAGS', d)}
cpp_link_args = ${@meson_array('LDFLAGS', d)}

[properties]
needs_exe_wrapper = true

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
    ./configure --target-arch=rv64imafdc --cross-prefix=riscv64-unknown-linux
    #--with-shared
}


do_compile() {
    #overridden default CONFIG
    oe_runmake CONFIG_HAVE_ARC4RANDOM=y
}

do_install() {

    oe_runmake install DESTDIR=${D}

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
