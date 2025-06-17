
HOMEPAGE = "https://github.com/etcd-io/etcd"
SUMMARY = "A distributed key-value store for shared config and service discovery"
DESCRIPTION = " \
    etcd is a distributed reliable key-value store for the most critical data \
    of a distributed system, with a focus on being: \
    \
    * Simple: well-defined, user-facing API (gRPC) \
    * Secure: automatic TLS with optional client cert authentication \
    * Fast: benchmarked 10,000 writes/sec \
    * Reliable: properly distributed using Raft \
"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
SECTION = "devel"

GO_IMPORT = "github.com/etcd-io/etcd"

export GO111MODULE = "on"
inherit go systemd

SRC_URI = "git://${GO_IMPORT};protocol=https;branch=main;destsuffix=${BPN}-${PV}/src/${GO_IMPORT} \
           file://etcd.service \
           file://etcd.conf \
           file://0001-add-riscv64-support.patch;patchdir=src/github.com/etcd-io/etcd \
"
SRCREV = "249c0d71d4e106e0d2f5576b9638f2e8bd75ca47"
PV = "3.6"

RDEPENDS:${PN} = "bash"

GO_INSTALL = "${GO_IMPORT}"

export GODEBUG = " cgocheck=2"
export GO_EXTLINK_ENABLED = "1"

do_compile[network] = "1"
#do_configure[noexec] = "1"


#fakeroot do_clean_pkg_mod() {
#    rm -rf ${B}/pkg/mod/*
#}

#addtask do_clean_pkg_mod before do_compile

do_compile() {
    export https_proxy="http://192.168.100.181:7890/"

    cd ${S}/src/${GO_IMPORT}
    make build

    chmod -R +w  ${B}/pkg/mod/*
}

do_install() {
    install -d ${D}/${bindir}
    install -m 0755 ${S}/src/${GO_IMPORT}/bin/etcd ${D}/${bindir}/etcd
    install -m 0755 ${S}/src/${GO_IMPORT}/bin/etcdctl ${D}/${bindir}/etcdctl
    install -m 0755 ${S}/src/${GO_IMPORT}/bin/etcdutl ${D}/${bindir}/etcdutl

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${UNPACKDIR}/etcd.service ${D}${systemd_system_unitdir}

    install -d ${D}/var/lib/${BPN}
    install -d ${D}${sysconfdir}/${BPN}/ssl
    #install -m 0644 ${UNPACKDIR}/etcd.conf ${D}${sysconfdir}/${BPN}
    install -m 0644 ${S}/src/github.com/etcd-io/etcd/contrib/systemd/etcd.service ${D}${sysconfdir}/${BPN}

    # we aren't creating a user, so we need to comment out this line
    sed -i '/User/s/^/#/' ${D}${systemd_unitdir}/system/etcd.service
}

#deltask compile_ptest_base

FILES:${PN} += "${systemd_system_unitdir}"

# During packaging etcd gets the warning "no GNU hash in elf binary"
# This issue occurs due to compiling without ldflags, but a
# solution has yet to be found. For now we ignore this error with
# the line below.
#INSANE_SKIP_${PN} = "ldflags"
