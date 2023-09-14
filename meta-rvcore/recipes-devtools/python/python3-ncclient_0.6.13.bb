
SUMMARY = "Python library for NETCONF clients"
HOMEPAGE = "https://github.com/ncclient/ncclient"
AUTHOR = "Shikhar Bhushan, Leonidas Poulopoulos, Ebben Aries, Einar Nilsen-Nygaard <shikhar@schmizz.net, lpoulopoulos@verisign.com, exa@dscp.org, einarnn@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/ee/6f/ef2796c82d097dbead1b804db8457fc8fdc244e3d6860eb0a702315dbf67/ncclient-0.6.13.tar.gz"
SRC_URI[md5sum] = "b269c9e1db60cb3a2998f8e31434a1bb"
SRC_URI[sha256sum] = "f9f8cea8bcbe057e1b948b9cd1b241eafb8a3f73c4981fbdfa1cc6ed69c0a7b3"

S = "${WORKDIR}/ncclient-0.6.13"

RDEPENDS_${PN} = ""

inherit setuptools3
