

DESCRIPTION = "openjdk for riscv"
HOMEPAGE = "http://openjdk.java.net/"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3e0b59f8fac05c3c03d4a26bbda13f8f"

SECTION = "devel"

DEPENDS = "autoconf-native make-native zip-native libpng libffi \
        fontconfig xserver-xorg  zlib json-c \
        libxtst libxt libxrandr libxtst \
        libxrender alsa-lib cups unzip-native"


BOOT_JDK_VERSION = "19"
SRC_URI = "git://github.com/openjdk/jdk.git;protocol=https;branch=master;name=openjdk \
           https://download.java.net/java/GA/jdk19/877d6127e982470ba2a7faa31cc93d04/36/GPL/openjdk-${BOOT_JDK_VERSION}_linux-x64_bin.tar.gz;name=bootjdk  \
           "

PV = "20+git${SRCPV}"

SRCREV_openjdk = "5dfc4ec7d94af9fe39fdee9d83b06101b827a3c6"

SRC_URI[bootjdk.sha256sum]="f47aba585cfc9ecff1ed8e023524e8309f4315ed8b80100b40c7dcc232c12f96"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

export JDK_PREFIX = "${libdir}/jvm/java-${PV}-openjdk-riscv64"

inherit update-alternatives

ALTERNATIVE:${PN} = "jar java javadoc jcmd jdb jdeps jhsdb jinfo jmap jpackage jrunscript jstack jstatd keytool	serialver \
                     jarsigner javac javap jconsole jdeprscan jfr jimage jlink jmod jps jshell jstat jwebserver rmiregistry"

ALTERNATIVE_TARGET[jar] = "${JDK_PREFIX}/bin/jar"
ALTERNATIVE_LINK_NAME[jar] = "${bindir}/jar"
ALTERNATIVE_PRIORITY[jar] ?= "300"

ALTERNATIVE_TARGET[java] = "${JDK_PREFIX}/bin/java"
ALTERNATIVE_LINK_NAME[java] = "${bindir}/java"
ALTERNATIVE_PRIORITY[java] ?= "300"

ALTERNATIVE_TARGET[javadoc] = "${JDK_PREFIX}/bin/javadoc"
ALTERNATIVE_LINK_NAME[javadoc] = "${bindir}/javadoc"
ALTERNATIVE_PRIORITY[javadoc] ?= "300"

ALTERNATIVE_TARGET[jcmd] = "${JDK_PREFIX}/bin/jcmd"
ALTERNATIVE_LINK_NAME[jcmd] = "${bindir}/jcmd"
ALTERNATIVE_PRIORITY[jcmd] ?= "300"
ALTERNATIVE_TARGET[jdb] = "${JDK_PREFIX}/bin/jdb"
ALTERNATIVE_LINK_NAME[jdb] = "${bindir}/jdb"
ALTERNATIVE_PRIORITY[jdb] ?= "300"
ALTERNATIVE_TARGET[jdeps] = "${JDK_PREFIX}/bin/jdeps"
ALTERNATIVE_LINK_NAME[jdeps] = "${bindir}/jdeps"
ALTERNATIVE_PRIORITY[jdeps] ?= "300"
ALTERNATIVE_TARGET[jhsdb] = "${JDK_PREFIX}/bin/jhsdb"
ALTERNATIVE_LINK_NAME[jhsdb] = "${bindir}/jhsdb"
ALTERNATIVE_PRIORITY[jhsdb] ?= "300"
ALTERNATIVE_TARGET[jinfo] = "${JDK_PREFIX}/bin/jinfo"
ALTERNATIVE_LINK_NAME[jinfo] = "${bindir}/jinfo"
ALTERNATIVE_PRIORITY[jinfo] ?= "300"
ALTERNATIVE_TARGET[jmap] = "${JDK_PREFIX}/bin/jmap"
ALTERNATIVE_LINK_NAME[jmap] = "${bindir}/jmap"
ALTERNATIVE_PRIORITY[jmap] ?= "300"
ALTERNATIVE_TARGET[jpackage] = "${JDK_PREFIX}/bin/jpackage"
ALTERNATIVE_LINK_NAME[jpackage] = "${bindir}/jpackage"
ALTERNATIVE_PRIORITY[jpackage] ?= "300"
ALTERNATIVE_TARGET[jrunscript] = "${JDK_PREFIX}/bin/jrunscript"
ALTERNATIVE_LINK_NAME[jrunscript] = "${bindir}/jrunscript"
ALTERNATIVE_PRIORITY[jrunscript] ?= "300"
ALTERNATIVE_TARGET[jstack] = "${JDK_PREFIX}/bin/jstack"
ALTERNATIVE_LINK_NAME[jstack] = "${bindir}/jstack"
ALTERNATIVE_PRIORITY[jstack] ?= "300"
ALTERNATIVE_TARGET[jstatd] = "${JDK_PREFIX}/bin/jstatd"
ALTERNATIVE_LINK_NAME[jstatd] = "${bindir}/jstatd"
ALTERNATIVE_PRIORITY[jstatd] ?= "300"
ALTERNATIVE_TARGET[keytool] = "${JDK_PREFIX}/bin/keytool"
ALTERNATIVE_LINK_NAME[keytool] = "${bindir}/keytool"
ALTERNATIVE_PRIORITY[keytool] ?= "300"
ALTERNATIVE_TARGET[serialver] = "${JDK_PREFIX}/bin/serialver"
ALTERNATIVE_LINK_NAME[serialver] = "${bindir}/serialver"
ALTERNATIVE_PRIORITY[serialver] ?= "300"
ALTERNATIVE_TARGET[jarsigner] = "${JDK_PREFIX}/bin/jarsigner"
ALTERNATIVE_LINK_NAME[jarsigner] = "${bindir}/jarsigner"
ALTERNATIVE_PRIORITY[jarsigner] ?= "300"
ALTERNATIVE_TARGET[javac] = "${JDK_PREFIX}/bin/javac"
ALTERNATIVE_LINK_NAME[javac] = "${bindir}/javac"
ALTERNATIVE_PRIORITY[javac] ?= "300"
ALTERNATIVE_TARGET[javap] = "${JDK_PREFIX}/bin/javap"
ALTERNATIVE_LINK_NAME[javap] = "${bindir}/javap"
ALTERNATIVE_PRIORITY[javap] ?= "300"
ALTERNATIVE_TARGET[jconsole] = "${JDK_PREFIX}/bin/jconsole"
ALTERNATIVE_LINK_NAME[jconsole] = "${bindir}/jconsole"
ALTERNATIVE_PRIORITY[jconsole] ?= "300"
ALTERNATIVE_TARGET[jdeprscan] = "${JDK_PREFIX}/bin/jdeprscan"
ALTERNATIVE_LINK_NAME[jdeprscan] = "${bindir}/jdeprscan"
ALTERNATIVE_PRIORITY[jdeprscan] ?= "300"
ALTERNATIVE_TARGET[jfr] = "${JDK_PREFIX}/bin/jfr"
ALTERNATIVE_LINK_NAME[jfr] = "${bindir}/jfr"
ALTERNATIVE_PRIORITY[jfr] ?= "300"
ALTERNATIVE_TARGET[jimage] = "${JDK_PREFIX}/bin/jimage"
ALTERNATIVE_LINK_NAME[jimage] = "${bindir}/jimage"
ALTERNATIVE_PRIORITY[jimage] ?= "300"
ALTERNATIVE_TARGET[jlink] = "${JDK_PREFIX}/bin/jlink"
ALTERNATIVE_LINK_NAME[jlink] = "${bindir}/jlink"
ALTERNATIVE_PRIORITY[jlink] ?= "300"
ALTERNATIVE_TARGET[jps] = "${JDK_PREFIX}/bin/jps"
ALTERNATIVE_LINK_NAME[jps] = "${bindir}/jps"
ALTERNATIVE_PRIORITY[jps] ?= "300"

ALTERNATIVE_TARGET[jshell] = "${JDK_PREFIX}/bin/jshell"
ALTERNATIVE_LINK_NAME[jshell] = "${bindir}/jshell"
ALTERNATIVE_PRIORITY[jshell] ?= "300"
ALTERNATIVE_TARGET[jmod] = "${JDK_PREFIX}/bin/jmod"
ALTERNATIVE_LINK_NAME[jmod] = "${bindir}/jmod"
ALTERNATIVE_PRIORITY[jmod] ?= "300"
ALTERNATIVE_TARGET[jstat] = "${JDK_PREFIX}/bin/jstat"
ALTERNATIVE_LINK_NAME[jstat] = "${bindir}/jstat"
ALTERNATIVE_PRIORITY[jstat] ?= "300"

ALTERNATIVE_TARGET[jwebserver] = "${JDK_PREFIX}/bin/jwebserver"
ALTERNATIVE_LINK_NAME[jwebserver] = "${bindir}/jwebserver"
ALTERNATIVE_PRIORITY[jwebserver] ?= "300"
ALTERNATIVE_TARGET[rmiregistry] = "${JDK_PREFIX}/bin/rmiregistry"
ALTERNATIVE_LINK_NAME[rmiregistry] = "${bindir}/rmiregistry"
ALTERNATIVE_PRIORITY[rmiregistry] ?= "300"


do_configure() {

    EXTRA_CFLAGS="${CFLAGS}"
    EXTRA_CXXFLAGS="${CXXFLAGS}"
    EXTRA_LDFLAGS="${LDFLAGS}"

    #if these vars being set, configure will warning
    unset CC CXX  CFLAGS  CXXFLAGS LDFLAGS
    bash ${S}/configure                            \
        --openjdk-target=riscv64-unknown-linux  \
        --with-sysroot=${STAGING_DIR_TARGET}     \
        --with-boot-jdk=${WORKDIR}/jdk-${BOOT_JDK_VERSION}/         \
        --disable-warnings-as-errors \
        --with-debug-level=slowdebug \
        --with-native-debug-symbols=external \
        --enable-javac-server \
        --with-zlib=bundled \
        --with-native-debug-symbols=none  \
        --with-extra-cflags="${HOST_CC_ARCH}${TOOLCHAIN_OPTIONS} ${EXTRA_CFLAGS}"   \
        --with-extra-cxxflags="${HOST_CC_ARCH}${TOOLCHAIN_OPTIONS} ${EXTRA_CXXFLAGS}" \
        --with-extra-ldflags="$EXTRA_LDFLAGS"
}

do_compile() {
    make images
}

do_compile[network] = "1"


do_install() {

    rm -rf ${D}${JDK_PREFIX}
    mkdir -p ${D}${JDK_PREFIX}

    cp -rp ${B}/images/jdk/* ${D}${JDK_PREFIX}
#    cp -rp ${B}/support/src.zip ${D}${JDK_PREFIX}

    chown -R root:root ${D}${JDK_PREFIX}
#   install -m644 ${WORKDIR}/jvm.cfg  ${D}${JDK_PREFIX}/jre/lib/${JDK_ARCH}/
#   find ${D}${JDK_PREFIX} -name "*.debuginfo" -exec rm {} \;
}

PACKAGES:append = " \
    ${PN}-source \
    ${PN}-demo \
"


FILES:${PN}:append = "\
    ${JDK_PREFIX}/bin \
    ${JDK_PREFIX}/conf \
    ${JDK_PREFIX}/lib \
    ${JDK_PREFIX}/jmods \
    ${JDK_PREFIX}/legal \
    ${JDK_PREFIX}/release \
"

FILES:${PN}-dev:append = "\
    ${JDK_PREFIX}/include \
"

FILES:${PN}-demo = " ${JDK_PREFIX}/demo"
RDEPENDS:${PN}-demo = " ${PN} "


FILES:${PN}-doc:append = "\
    ${JDK_PREFIX}/man \
"

