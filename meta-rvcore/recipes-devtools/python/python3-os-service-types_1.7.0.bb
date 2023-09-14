
SUMMARY = "Python library for consuming OpenStack sevice-types-authority data"
HOMEPAGE = "https://docs.openstack.org/os-service-types/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/58/3f/09e93eb484b69d2a0d31361962fb667591a850630c8ce47bb177324910ec/os-service-types-1.7.0.tar.gz"
SRC_URI[md5sum] = "4a5bc8a60dfb3e98f5e5f975b173c04d"
SRC_URI[sha256sum] = "31800299a82239363995b91f1ebf9106ac7758542a1e4ef6dc737a5932878c6c"

S = "${WORKDIR}/os-service-types-1.7.0"

RDEPENDS_${PN} = "python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
