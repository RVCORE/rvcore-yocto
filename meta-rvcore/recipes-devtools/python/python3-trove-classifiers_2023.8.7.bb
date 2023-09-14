
SUMMARY = "Canonical source for classifiers on PyPI (pypi.org)."
HOMEPAGE = "https://github.com/pypa/trove-classifiers"
AUTHOR = "The PyPI Admins <admin@pypi.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://files.pythonhosted.org/packages/a7/56/a8eb4a6df619f8301a10b71c50ad6e61f5c0b35cb8c57be42d5adb35530e/trove-classifiers-2023.8.7.tar.gz"
SRC_URI[md5sum] = "6ae148c8374d131dd18e28c22275d56a"
SRC_URI[sha256sum] = "c9f2a0a85d545e5362e967e4f069f56fddfd91215e22ffa48c66fb283521319a"

S = "${WORKDIR}/trove-classifiers-2023.8.7"

RDEPENDS_${PN} = ""
DEPENDS = "python3-calver-native"

#inherit setuptools3
inherit pypi python_setuptools_build_meta

BBCLASSEXTEND = "native nativesdk"
