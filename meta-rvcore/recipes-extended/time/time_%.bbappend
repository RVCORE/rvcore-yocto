
do_install:append() {
	install -d ${D}${base_bindir}
	ln -s ${bindir}/time ${D}${base_bindir}/time
}
