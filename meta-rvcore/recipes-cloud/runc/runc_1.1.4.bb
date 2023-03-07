SUMMARY = "CLI tool for spawning and running containers according to the OCI specification"
DESCRIPTION = "CLI tool for spawning and running containers according to the OCI specification"
HOMEPAGE = "www.opencontainers.org/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=435b266b3899aa8a959f17d41c56def8"
SECTION = "devel"

DEPENDS = "libseccomp pkgconfig-native"
RDEPENDS:runcmod-dev = "bash"

GO_IMPORT = "github.com/opencontainers/runc"

export GO111MODULE="on"
inherit go

GO_INSTALL = "${GO_IMPORT}"

export GODEBUG = " cgocheck=2"
export GO_EXTLINK_ENABLED = "1"

#SRCREV = "${AUTOREV}"
#PV = "1.1.4-git${SRCPV}"

SRCREV = "58c192a1be475dbab874ae96f17499ce5b18eabf"
PV = "1.1.4"

SRC_URI = "git://${GO_IMPORT};protocol=https;branch=main;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"

do_configure[noexec] = "1"

do_compile() {
        cd ${S}/src/${GO_IMPORT}
        make
}

do_install() {
        cd  ${S}/src/${GO_IMPORT}
        DESTDIR=${D} PREFIX=/usr make install
}
