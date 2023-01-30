SUMMARY = "Verilator open-source SystemVerilog simulator and lint system"
HOMEPAGE = "https://www.veripool.org/wiki/verilator"
LICENSE = "LGPL-3.0-only"
SECTION = "devel/verilog"


LIC_FILES_CHKSUM = "file://LICENSE;md5=3000208d539ec061b899bce1d9ce9404"

DEPENDS = "flex-native bison-native flex \
            python3-native perl-native ccache-native \
"

RDEPENDS:verilator = "ccache numactl perl-doc g++"

SRC_URI = "git://github.com/verilator/verilator;protocol=https;branch=master \
           file://0001-fix-issue-that-g-can-not-find-header.patch \
           "

SRCREV = "e6554e061c0615eccab83c4ce48f280813fc8773"

PV = "4.218+git${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools autotools-brokensep

do_configure() {
    autoconf
    oe_runconf
}


do_install:append() {

    verilator_bins="verilator verilator_bin verilator_bin_dbg verilator_coverage  \
                    verilator_coverage_bin_dbg verilator_gantt \
                    verilator_profcfunc"

    for i in ${verilator_bins}
    do
        ln -s ${@os.path.relpath(d.expand("${bindir}"), d.expand("${datadir}/verilator/bin"))}/$i \
              ${D}${datadir}/verilator/bin/$i
    done
}

SYSROOT_DIRS_NATIVE:append = " ${datadir}/verilator"

BBCLASSEXTEND = "native nativesdk"
