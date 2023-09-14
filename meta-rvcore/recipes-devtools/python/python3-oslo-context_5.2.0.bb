
SUMMARY = "Oslo Context library"
HOMEPAGE = "https://docs.openstack.org/oslo.context/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/3b/8a/76fc45a4a7b8e0e21c3c4c9046370438eecd55baa761f467ae1e9ce86732/oslo.context-5.2.0.tar.gz"
SRC_URI[md5sum] = "3b947e4ef53e331697bdff854b5f6f97"
SRC_URI[sha256sum] = "30f008ae0c08c781534a7b87b9d75d4ecedb66b43f5bed448e3873362aba4e64"

S = "${WORKDIR}/oslo.context-5.2.0"

RDEPENDS_${PN} = "python3-debtcollector python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
