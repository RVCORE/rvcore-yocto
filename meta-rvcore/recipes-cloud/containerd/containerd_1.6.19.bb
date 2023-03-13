SUMMARY = "An open and reliable container runtime"
DESCRIPTION = "containerd is an industry-standard container runtime with an emphasis on simplicity, \
            robustness, and portability. It is available as a daemon for Linux and Windows, which can \
            manage the complete container lifecycle of its host system: image transfer and storage, \
            container execution and supervision, low-level storage and network attachments, etc."


HOMEPAGE = "https://github.com/containerd/containerd"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=1269f40c0d099c21a871163984590d89"
SECTION = "devel"


DEPENDS = "btrfs-tools protobuf"
#RDEPENDS:containerd-dev = "bash"
RDEPENDS:containerd = "runc"

GO_IMPORT = "github.com/containerd/containerd"

export GO111MODULE="on"
inherit go

GO_INSTALL = "${GO_IMPORT}"

#SRCREV = "${AUTOREV}"
#SRCREV = "v1.6.19"
#PV = "1.6.19-git${SRCPV}"

SRCREV = "1e1ea6e986c6c86565bc33d52e34b81b3e2bc71f"

SRC_URI = "git://${GO_IMPORT};protocol=https;branch=release/1.6;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"

do_compile() {
        cd ${S}/src/${GO_IMPORT}
        make
}

do_install() {
        cd  ${S}/src/${GO_IMPORT}
        DESTDIR=${D} PREFIX=/usr make install
}

export GODEBUG = " cgocheck=2"
export GO_EXTLINK_ENABLED = "1"

