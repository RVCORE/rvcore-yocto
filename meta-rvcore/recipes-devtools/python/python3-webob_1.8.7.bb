
SUMMARY = "WSGI request and response object"
HOMEPAGE = "http://webob.org/"
AUTHOR = "Ian Bicking <ianb@colorstudy.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=82df5319c9135462ebcc5f84e5f0b2ec"

SRC_URI = "https://files.pythonhosted.org/packages/c7/45/ee5f034fb4ebe3236fa49e5a4fcbc54444dd22ecf33079cf56f9606d479d/WebOb-1.8.7.tar.gz"
SRC_URI[md5sum] = "10191c69fa5a2c00f3b9abfb8937b415"
SRC_URI[sha256sum] = "b64ef5141be559cfade448f044fa45c2260351edcb6a8ef6b7e00c7dcef0c323"

S = "${WORKDIR}/WebOb-1.8.7"

RDEPENDS_${PN} = ""

inherit setuptools3
