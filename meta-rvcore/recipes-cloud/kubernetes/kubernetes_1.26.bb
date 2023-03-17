SUMMARY = "Production-Grade Container Scheduling and Management"
DESCRIPTION = "Production-Grade Container Scheduling and Management"

HOMEPAGE = "https://github.com/kubernetes/kubernetes"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
SECTION = "devel"


DEPENDS = "go-runtime"
RDEPENDS:kubernetes = "containerd runc"

GO_IMPORT = "github.com/kubernetes/kubernetes"

export GO111MODULE="on"
inherit go

GO_INSTALL = "${GO_IMPORT}"

SRCREV = "742316ee2136b24b9edb0bb0d5bf69a6bad6f364"

SRC_URI = "git://${GO_IMPORT};protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"

do_configure[noexec] = "1"

do_compile() {
    cd ${S}/src/${GO_IMPORT}
    KUBE_BUILD_PLATFORMS=linux/riscv64 make DBG=1
}

do_install() {
    install -d ${D}${bindir}
    cp -rp --no-preserve=ownership ${S}/src/${GO_IMPORT}/_output/local/go/bin/linux_riscv64/* ${D}${bindir}
}

export GODEBUG = " cgocheck=2"
export GO_EXTLINK_ENABLED = "1"
