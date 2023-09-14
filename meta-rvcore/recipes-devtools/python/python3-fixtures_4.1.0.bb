
SUMMARY = "Fixtures, reusable state for writing clean tests and more."
HOMEPAGE = "https://github.com/testing-cabal/fixtures"
AUTHOR = "Robert Collins <robertc@robertcollins.net>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=239e2f4698b85aad5ed39bae5d2ef226"

SRC_URI = "https://files.pythonhosted.org/packages/5e/4c/3c3faee9f554d753ee428bef3a5e8176995cffbf0b5ad3f1d6c272ab2148/fixtures-4.1.0.tar.gz"
SRC_URI[md5sum] = "de0efb51ea247297002c8c7687b187c3"
SRC_URI[sha256sum] = "82b1c5e69f615526ef6c067188a1e6c6067df7f88332509c99f8b8fdbb9776f3"

S = "${WORKDIR}/fixtures-4.1.0"

RDEPENDS_${PN} = "python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native"

#inherit setuptools3
inherit pypi python_setuptools_build_meta

