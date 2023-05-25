SUMMARY = "CFSSL: Cloudflare's PKI and TLS toolkit"

HOMEPAGE = "https://github.com/cloudflare/cfssl"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=9bd1e7022303d9bbc29fda142f3e4fd0"

SECTION = "devel"
DEPENDS = ""

SRC_URI = "git://${GO_IMPORT};branch=master;protocol=https;"


SRCREV = "88bfcbf5e0fdbb6d8ddbb89e51618b0dc40bd9f5"
PV = "v1.6.4"

GO_IMPORT = "github.com/cloudflare/cfssl"
#S = "${WORKDIR}/git/src/github.com/kubernetes/kubernetes"


inherit go



do_compile() {
    export https_proxy=http://192.168.100.199:1091
    cd ${S}/src/${GO_IMPORT}
    make
}

#do_configure[noexec] = "1"
#do_compile[network] = "1"


do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/src/${GO_IMPORT}/bin/*  ${D}/${bindir}
}

INSANE_SKIP:${PN} += "ldflags already-stripped"
