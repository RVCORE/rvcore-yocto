
SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/02/d8/acee75603f31e27c51134a858e0dea28d321770c5eedb9d1d673eb7d3817/pbr-5.11.1.tar.gz"
SRC_URI[md5sum] = "3e79b3af66a506f6ceb3eb51be9407ae"
SRC_URI[sha256sum] = "aefc51675b0b533d56bb5fd1c8c6c0522fe31896679882e1c4c63d5e4a0fccb3"

S = "${WORKDIR}/pbr-5.11.1"

RDEPENDS_${PN} = ""

inherit setuptools3
