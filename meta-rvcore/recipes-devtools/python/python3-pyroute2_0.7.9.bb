SUMMARY = "A pure Python netlink and Linux network configuration library"
LICENSE = "GPL-2.0-only & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.GPL-2.0-or-later;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
                    file://LICENSE.Apache-2.0;md5=34281e312165f843a2b7d1f114fe65ce"

SRC_URI[sha256sum] = "b69d82f140b0774317d7ba40f6c5fa1d755098ba3f3eb619982d16e750dc631a"

inherit setuptools3 pypi ptest

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-ctypes \
    ${PYTHON_PN}-distutils \
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-logging \
    ${PYTHON_PN}-multiprocessing \
    ${PYTHON_PN}-pickle \
    ${PYTHON_PN}-pkgutil \
    ${PYTHON_PN}-pprint \
    ${PYTHON_PN}-shell \
    ${PYTHON_PN}-unixadmin \
"

SRC_URI += " \
	file://run-ptest \
"

RDEPENDS:${PN}-ptest += " \
	${PYTHON_PN}-pytest \
	${PYTHON_PN}-fcntl \
"

do_install_ptest() {
	install -d ${D}${PTEST_PATH}/tests
	cp -rf ${S}/tests/* ${D}${PTEST_PATH}/tests/
}
