
SUMMARY = "Provider of IANA time zone data"
HOMEPAGE = "https://github.com/python/tzdata"
AUTHOR = "Python Software Foundation <datetime-sig@python.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fca9fd5c15a28eb874ba38577a585d48"

SRC_URI = "https://files.pythonhosted.org/packages/70/e5/81f99b9fced59624562ab62a33df639a11b26c582be78864b339dafa420d/tzdata-2023.3.tar.gz"
SRC_URI[md5sum] = "3c8f05d031770659a7d80de5159af202"
SRC_URI[sha256sum] = "11ef1e08e54acb0d4f95bdb1be05da659673de4acbd21bf9c69e94cc5e907a3a"

S = "${WORKDIR}/tzdata-2023.3"

RDEPENDS_${PN} = ""

inherit pypi python_setuptools_build_meta
