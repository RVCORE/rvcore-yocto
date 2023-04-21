SUMMARY = ".NET is a cross-platform runtime for cloud, mobile, desktop, and IoT apps."
HOMEPAGE = "https://github.com/dotnet/runtime"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.TXT;md5=9fc642ff452b28d62ab19b7eea50dfb9"

SECTION = "devel"
DEPENDS = "cmake-native clang-cross-${TARGET_ARCH} zlib krb5 icu lttng-ust"

#SRC_URI = "git://github.com/dotnet/runtime.git;protocol=https;branch=release/8.0-preview3"
#SRCREV = "47bad717bd69883ec8f590ffbbfad63c868cbe55"

SRC_URI = "git://github.com/clamp03/runtime.git;protocol=https;branch=riscv64_230220 \
           file://0001-for-yocto-build.patch \
           "
SRCREV = "14dce32ae4991a65f998bcf5546ded66794cfea1"
#SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
B = "${S}"

do_configure[noexec] = "1"

build_type="Debug"
#build_type="Release"

TOOLCHAIN="riscv64-unknown-linux"

do_compile() {
    if [ -d artifacts ]; then
        rm -rf artifacts
    fi
    export HTTPS_PROXY=http://192.168.100.199:1091/
    export https_proxy=http://192.168.100.199:1091/

    export EXTRA_CFLAGS="${HOST_CC_ARCH}${TOOLCHAIN_OPTIONS}"
    export EXTRA_CXXFLAGS="${HOST_CC_ARCH}${TOOLCHAIN_OPTIONS}"
    export EXTRA_LDFLAGS="${TOOLCHAIN_OPTIONS} ${HOST_LD_ARCH}"

    #export CLR_CC=${STAGING_DIR_NATIVE}/usr/bin/riscv64-unknown-linux/riscv64-unknown-linux-gcc
    #export CLR_CXX=${STAGING_DIR_NATIVE}/usr/bin/riscv64-unknown-linux/riscv64-unknown-linux-g++

    #unset CC CXX  CFLAGS  CXXFLAGS LDFLAGS

    #set prefix in eng/common/cross/toolchain.cmake to find riscv64-unknown-linux-ar
    export TOOLCHAIN="${TOOLCHAIN}"

    export CLR_CC="${TOOLCHAIN}-gcc"
    export CLR_CXX="${TOOLCHAIN}-g++"

    export YOCTO_CC="$CC"
    export YOCTO_CXX="$CXX"
    export YOCTO_CFLAGS="$CFLAGS"
    export YOCTO_CXXFLAGS="$CXXFLAGS"
    export YOCTO_LDFLAGS="$LDFLAGS"

    #unset CC CXX  CFLAGS  CXXFLAGS 

    export ROOTFS_DIR="${STAGING_DIR_TARGET}"
    #./build.sh --subset clr --configuration Release --arch arm64 --cross
    #./build.sh --subset mono+libs --configuration Debug --arch riscv64 --cross --os linux --verbosity diag --gcc
    ./build.sh --subset clr+libs --configuration ${build_type} --arch riscv64 --cross --os linux --verbosity normal --gcc
}

do_compile[network] = "1"

do_install() {
    install -d ${D}${bindir}/coreclr/linux.riscv64.${build_type}/IL
    cp -rp ${S}/artifacts/bin/coreclr/linux.riscv64.${build_type}/corerun  ${D}${bindir}/coreclr/linux.riscv64.${build_type}
    cp -rp ${S}/artifacts/bin/coreclr/linux.riscv64.${build_type}/libcoreclr.so  ${D}${bindir}/coreclr/linux.riscv64.${build_type}
    cp -rp ${S}/artifacts/bin/coreclr/linux.riscv64.${build_type}/System.Private.CoreLib.dll ${D}${bindir}/coreclr/linux.riscv64.${build_type}
    cp -rp ${S}/artifacts/bin/coreclr/linux.riscv64.${build_type}/IL/System.Private.CoreLib.dll ${D}${bindir}/coreclr/linux.riscv64.${build_type}/IL
}

INSANE_SKIP:${PN} += "ldflags already-stripped"
