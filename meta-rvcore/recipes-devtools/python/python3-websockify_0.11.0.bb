
SUMMARY = "Websockify."
HOMEPAGE = "https://github.com/novnc/websockify"
AUTHOR = "Joel Martin <github@martintribe.org>"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "https://files.pythonhosted.org/packages/a2/7e/4b1901e96f5a5eb06bb13927618097e1bb36df9bed6bfc0e6cae2fd207f2/websockify-0.11.0.tar.gz"
SRC_URI[md5sum] = "a1d7d081a5738f6446ca78e04d16dc85"
SRC_URI[sha256sum] = "ef10ed32fa2abea2af6fd068de63d8bc3c5b780af8c128e9460d91173003cf8f"

S = "${WORKDIR}/websockify-0.11.0"

RDEPENDS_${PN} = "python3-numpy python3-requests python3-jwcrypto python3-redis python3-simplejson"

inherit setuptools3
