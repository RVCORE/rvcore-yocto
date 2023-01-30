FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
#FILES:${PN}:remove = "${bindir}/streamzip"

do_install:append() {

    rm ${D}${bindir}/streamzip
    rm ${D}${bindir}/zipdetails
    rmdir ${D}${bindir}
}
