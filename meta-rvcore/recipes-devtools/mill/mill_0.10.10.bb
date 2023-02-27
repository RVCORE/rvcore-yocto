# Copyright (C) 2023 Your Name <you@example.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Your shiny new Java/Scala build tool!"
HOMEPAGE = "https://github.com/com-lihaoyi/mill"
LICENSE = "LGPL-3.0-only"
SECTION = "devel/mill"
DEPENDS = "curl-native openjdk-binary-native bash-native"

#ca-certificates-native 

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08a3c7271d440a2388964b1d9289507a"

#0.9.x branch will error when exec mill --no-server --home ../ammonite  YinXing.prepareOffline
#SRC_URI += "git://github.com/com-lihaoyi/mill.git;branch=0.9.x;protocol=https;name=mill"
#SRCREV_mill = "93e35afe986e917de02359097cb8c31bc1aa0642"

SRC_URI += "git://github.com/com-lihaoyi/mill.git;branch=main;protocol=https;name=mill"
SRCREV_mill = "70687949e6ab5a0ffbcd7a14a7b6ade069be7183"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

#do_configure:append() {
do_compile() {
    export HTTPS_PROXY=http://192.168.100.199:1091/
    export https_proxy=http://192.168.100.199:1091/

    #download path
    export MILL_BASE=${DL_DIR}/${BP}
    export XDG_CACHE_HOME=${MILL_BASE}

    mkdir -p ${B}/tmp/bin
    mkdir -p ${B}/usr/bin/

    mkdir -p ${MILL_BASE}/ivyRepo

    #1st compile tmp/bin/mill
    cd ${S}

    #create two mill download dirs based on ${XDG_CACHE_HOME}
    ./mill --no-server installLocal --binFile ${B}/tmp/bin/mill --ivyRepo ${MILL_BASE}/ivyRepo

    echo "run tmp/bin/mill in do_compile()"
    cd ${B}     #will mkdir out
    sh ${B}/tmp/bin/mill --no-server version
    rm -rf out

    #2nd compile tmp/usr/bin/mill
    cd ${S}

    #clean the 1st build output
    rm -rf out

    #use the same ivyRepo, because there is no any differece between two compilation
    sh ${B}/tmp/bin/mill --no-server installLocal --binFile ${B}/usr/bin/mill --ivyRepo ${MILL_BASE}/ivyRepo

    echo "run usr/bin/mill in do_compile()"
    cd ${B}     #will mkdir out
    sh ${B}/usr/bin/mill --no-server version
}

do_compile[network] = "1"
do_install[network] = "1"


do_install:prepend () {

    export https_proxy=http://192.168.100.199:1091/

    export MILL_BASE=${DL_DIR}/${BP}
    cd ${B}

    if [ ! -d ${MILL_BASE}/YinXing ]
    then
        git clone https://github.com/RVCORE/YinXing.git ${MILL_BASE}/YinXing
        cd ${MILL_BASE}/YinXing
        make init
    fi

    cd ${B}
}

do_install() {
    export https_proxy=http://192.168.100.199:1091/

    export MILL_BASE=${DL_DIR}/${BP}
    export COURSIER_CACHE=${MILL_BASE}/coursier/v1

    export AMMONITE_HOME="${MILL_BASE}/ammonite"

    #create ammonite dir based on ${MILL_BASE}
    mkdir -p ${AMMONITE_HOME}

    #run mill on build.sc to download libs
    cd ${MILL_BASE}/YinXing

    sh ${B}/usr/bin/mill --no-server --home ${AMMONITE_HOME} __.prepareOffline

    install -d ${D}/${bindir}
    install -d ${D}/${datadir}/${PN}/cache

    install ${B}/usr/bin/mill ${D}/usr/bin/
    #cp -r --no-preserve=ownership ${MILL_BASE}/coursier/v1/https ${D}/${datadir}/${PN}/cache/
    cp -r --no-preserve=ownership ${COURSIER_CACHE}/https ${D}/${datadir}/${PN}/cache/

    #mill compile output published locally
#    cp -r --no-preserve=ownership ${B}/ivyRepo ${D}/${datadir}/${PN}/cache/

#    cp -r --no-preserve=ownership ${B}/ammonite ${D}/${datadir}/${PN}/cache/
}

PACKAGES:append = "\
    ${PN}-jars \
"

FILES:${PN}:remove = "${datadir}/${BPN}"
FILES:${PN}-jars:append = "${datadir}/${BPN}/cache"
