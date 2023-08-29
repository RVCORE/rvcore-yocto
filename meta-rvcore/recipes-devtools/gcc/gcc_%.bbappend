FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
EXTRA_OECONF:append = " --enable-libgomp"
