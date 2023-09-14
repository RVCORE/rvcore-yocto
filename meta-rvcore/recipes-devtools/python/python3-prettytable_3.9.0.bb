
SUMMARY = "A simple Python library for easily displaying tabular data in a visually appealing ASCII table format"
HOMEPAGE = ""
AUTHOR = " <Luke Maurits <luke@maurits.id.au>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c9a6829fcd174d9535b46211917c7671"

SRC_URI = "https://files.pythonhosted.org/packages/e1/c0/5e9c4d2a643a00a6f67578ef35485173de273a4567279e4f0c200c01386b/prettytable-3.9.0.tar.gz"
SRC_URI[md5sum] = "a63e319853747d83526c5435ab5223a1"
SRC_URI[sha256sum] = "f4ed94803c23073a90620b201965e5dc0bccf1760b7a7eaf3158cab8aaffdf34"

S = "${WORKDIR}/prettytable-3.9.0"

RDEPENDS_${PN} = "python3-wcwidth"
DEPENDS = "python3-hatch-vcs-native"

inherit pypi python_hatchling
