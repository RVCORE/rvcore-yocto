
SUMMARY = "A cross-platform clipboard module for Python. (Only handles plain text for now.)"
HOMEPAGE = "https://github.com/asweigart/pyperclip"
AUTHOR = "Al Sweigart <al@inventwithpython.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=dc8ed8ba9f09f565f0fe63910e4ce0fc"

SRC_URI = "https://files.pythonhosted.org/packages/a7/2c/4c64579f847bd5d539803c8b909e54ba087a79d01bb3aba433a95879a6c5/pyperclip-1.8.2.tar.gz"
SRC_URI[md5sum] = "853603b2e8fa1b13622fdbe72d1fb201"
SRC_URI[sha256sum] = "105254a8b04934f0bc84e9c24eb360a591aaf6535c9def5f29d92af107a9bf57"

S = "${WORKDIR}/pyperclip-1.8.2"

RDEPENDS_${PN} = ""

inherit setuptools3
