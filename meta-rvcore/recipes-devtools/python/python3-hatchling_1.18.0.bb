
SUMMARY = "Modern, extensible Python build backend"
HOMEPAGE = ""
AUTHOR = " <Ofek Lev <oss@ofek.dev>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=cbe2fd33fc9297692812fc94b7d27fd9"

SRC_URI = "https://files.pythonhosted.org/packages/e3/57/87da2c5adc173950ebe9f1acce4d5f2cd0a960783992fd4879a899a0b637/hatchling-1.18.0.tar.gz"
SRC_URI[md5sum] = "43f7203cacb6c3c178b93149b8a8151d"
SRC_URI[sha256sum] = "50e99c3110ce0afc3f7bdbadff1c71c17758e476731c27607940cfa6686489ca"

S = "${WORKDIR}/hatchling-1.18.0"

RDEPENDS_${PN} = "python3-editables python3-packaging python3-pathspec python3-pluggy python3-trove-classifiers"
DEPENDS = "python3-pathspec-native python3-editables-native python3-pluggy-native python3-trove-classifiers-native"

#inherit setuptools3
inherit pypi python_setuptools_build_meta
