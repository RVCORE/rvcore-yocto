
SUMMARY = "A Python module to customize the process title"
HOMEPAGE = "https://github.com/dvarrazzo/py-setproctitle"
AUTHOR = "Daniele Varrazzo <daniele.varrazzo@gmail.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://setup.py;md5=283b7ed7c0c50e52cfcdaa7300e78d79"

PYPI_SRC_URI = "https://files.pythonhosted.org/packages/b5/47/ac709629ddb9779fee29b7d10ae9580f60a4b37e49bce72360ddf9a79cdc/setproctitle-1.3.2.tar.gz"
SRC_URI[md5sum] = "fa9771540422a59a8dee1331ad6fd3a9"
SRC_URI[sha256sum] = "b9fb97907c830d260fa0658ed58afd48a86b2b88aac521135c352ff7fd3477fd"

S = "${WORKDIR}/setproctitle-1.3.2"

RDEPENDS_${PN} = ""

inherit pypi setuptools3
