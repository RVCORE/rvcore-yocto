
SUMMARY = "Utility library for gitignore style pattern matching of file paths."
HOMEPAGE = ""
AUTHOR = " <"Caleb P. Burns" <cpburnz@gmail.com>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = "https://files.pythonhosted.org/packages/a0/2a/bd167cdf116d4f3539caaa4c332752aac0b3a0cc0174cdb302ee68933e81/pathspec-0.11.2.tar.gz"
SRC_URI[md5sum] = "92ebd6d735d261952ff99d64083eeff4"
SRC_URI[sha256sum] = "e0d8d0ac2f12da61956eb2306b69f9469b42f4deb0f3cb6ed47b9cce9996ced3"

S = "${WORKDIR}/pathspec-0.11.2"

RDEPENDS_${PN} = ""

inherit setuptools3

BBCLASSEXTEND = "native nativesdk"
