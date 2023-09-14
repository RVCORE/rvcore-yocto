
SUMMARY = "Oslo Rootwrap"
HOMEPAGE = "https://docs.openstack.org/oslo.rootwrap/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c46f31914956e4579f9b488e71415ac8"

SRC_URI = "https://files.pythonhosted.org/packages/40/d7/3a43690bd48439221d6eea3efb11105db820251ad9bfa31fefadb5e8e3c0/oslo.rootwrap-7.1.0.tar.gz"
SRC_URI[md5sum] = "62ff88fd3919f28fe225d808c1afef33"
SRC_URI[sha256sum] = "e693da2dc467354e70a03fb008b5ab67396c3930f1f5a4a5151674e4df0e0cbe"

S = "${WORKDIR}/oslo.rootwrap-7.1.0"

RDEPENDS_${PN} = ""
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
