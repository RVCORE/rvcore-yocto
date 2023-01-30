

DESCRIPTION = "openjdk for yocto native"
HOMEPAGE = "http://openjdk.java.net/"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://legal/java.se/LICENSE;md5=3e0b59f8fac05c3c03d4a26bbda13f8f"

SECTION = "devel"

JDK_VERSION="19"
PV = "${JDK_VERSION}"
SRC_URI = "https://download.java.net/java/GA/jdk19/877d6127e982470ba2a7faa31cc93d04/36/GPL/openjdk-${JDK_VERSION}_linux-x64_bin.tar.gz;name=bootjdk  \
           "

SRC_URI[bootjdk.sha256sum]="f47aba585cfc9ecff1ed8e023524e8309f4315ed8b80100b40c7dcc232c12f96"


S = "${WORKDIR}/jdk-${JDK_VERSION}"

export JDK_PREFIX = "${libdir}/jvm/java-${PV}-openjdk-riscv64"


inherit native


#SYSROOT_DIRS_NATIVE += "/usr/bin"


do_install() {

    rm -rf ${D}${JDK_PREFIX}
    install -d ${D}${JDK_PREFIX}

    cp -r --no-preserve=ownership ${B}/* ${D}${JDK_PREFIX}

    mkdir -p ${D}${bindir}
    cd ${D}${bindir}

    target_list=$(ls ${D}${JDK_PREFIX}/bin)

    for src in $target_list
    do
        name=$(basename $src) 
        ln -s ../lib/jvm/java-${PV}-openjdk-riscv64/bin/${name} ${name}
    done
}
