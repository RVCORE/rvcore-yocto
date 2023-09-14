
SUMMARY = "A very small text templating language"
HOMEPAGE = "http://pythonpaste.org/tempita/"
AUTHOR = "Ian Bicking <ianb@colorstudy.com>"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ff5afba767c5e34d2ddbc42fe700903e"

PYPI_SRC_URI = "https://files.pythonhosted.org/packages/56/c8/8ed6eee83dbddf7b0fc64dd5d4454bc05e6ccaafff47991f73f2894d9ff4/Tempita-0.5.2.tar.gz \
                file://0001-new-setuptools3-has-no-use_2to3.patch \
"
SRC_URI[md5sum] = "4c2f17bb9d481821c41b6fbee904cea1"
SRC_URI[sha256sum] = "cacecf0baa674d356641f1d406b8bff1d756d739c46b869a54de515d08e6fc9c"


RDEPENDS_${PN} = ""
DEPENDS = "python3-setuptools-native"

#inherit pypi setuptools3
inherit pypi python_setuptools_build_meta


S = "${WORKDIR}/Tempita-0.5.2"
