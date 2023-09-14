
SUMMARY = "Resource Classes for OpenStack"
HOMEPAGE = "https://docs.openstack.org/os-resource-classes/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/44/81/0f05d5d149dbd20e7ca652b57a329b571c4b068a24df6edc65ca4cfc2e16/os-resource-classes-1.1.0.tar.gz"
SRC_URI[md5sum] = "3d9a25ddcd68b5d1fdec0981271b896e"
SRC_URI[sha256sum] = "e0bcbb8961a9fe33b7213734c51c001812890e2be62101c9279c88b72f75f9eb"

S = "${WORKDIR}/os-resource-classes-1.1.0"

RDEPENDS_${PN} = "python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
