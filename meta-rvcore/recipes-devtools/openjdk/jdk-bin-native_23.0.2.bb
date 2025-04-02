
SUMMARY = "Cross-platform, open-source java"

DESCRIPTION = "openjdk for yocto native"
HOMEPAGE = "http://openjdk.java.net/"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://legal/java.base/LICENSE;md5=7369866495acb2d7e57397f06a3ab0ba"

SECTION = "devel"

JDK_VERSION="23"

SRC_URI = "https://download.oracle.com/java/23/latest/jdk-${JDK_VERSION}_linux-x64_bin.tar.gz;name=bootjdk"

SRC_URI[bootjdk.sha256sum]="12d7553d06b5cacf88b26cad4a8ba83cabe79646f1defb1b7fd029f3356d0922"


S = "${WORKDIR}/jdk-${PV}"

export JDK_PREFIX = "${libdir}/jvm/java-${PV}-openjdk-riscv64"


inherit native


#SYSROOT_DIRS_NATIVE += "/usr/bin"

do_install() {

    rm -rf ${D}${JDK_PREFIX}
    install -d ${D}${JDK_PREFIX}

    cp -r --no-preserve=ownership ${S}/* ${D}${JDK_PREFIX}

    mkdir -p ${D}${bindir}
    cd ${D}${bindir}

    target_list=$(ls ${D}${JDK_PREFIX}/bin)

    for src in $target_list
    do
        name=$(basename $src) 
        ln -s ../lib/jvm/java-${PV}-openjdk-riscv64/bin/${name} ${name}
    done
}
