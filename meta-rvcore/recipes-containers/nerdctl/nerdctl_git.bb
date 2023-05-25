SUMMARY = "CLI for containerd"

HOMEPAGE = "https://github.com/containerd/nerdctl"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"


SECTION = "devel"
DEPENDS = ""

SRC_URI = "git://${GO_IMPORT};branch=main;protocol=https;"


SRCREV = "732e6a9e73ce9f33f0e4419706c7deb4c995f65c"
PV = "1.4.0"

GO_IMPORT = "github.com/containerd/nerdctl"
#S = "${WORKDIR}/git/src/github.com/kubernetes/kubernetes"


inherit go



do_compile() {
    export https_proxy=http://192.168.100.199:1091
    cd ${S}/src/${GO_IMPORT}
    make
}

#do_configure[noexec] = "1"
do_compile[network] = "1"


do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/src/${GO_IMPORT}/_output/nerdctl  ${D}/${bindir}
}

INSANE_SKIP:${PN} += "ldflags already-stripped"
