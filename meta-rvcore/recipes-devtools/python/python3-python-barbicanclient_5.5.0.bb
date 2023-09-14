
SUMMARY = "Client Library for OpenStack Barbican Key Management API"
HOMEPAGE = "https://docs.openstack.org/python-barbicanclient/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e031cff4528978748f9cc064c6e6fa73"

SRC_URI = "https://files.pythonhosted.org/packages/bf/96/cd43aebd65b6c6da51be5e83b3c958a5f9525606c737406476da2ecaaabe/python-barbicanclient-5.5.0.tar.gz"
SRC_URI[md5sum] = "d0035364abf27779884bb002ff34f0e2"
SRC_URI[sha256sum] = "5def6e7aea465dae01860ede8bcc56d5fe808a1167f45aeb22a4fefc5d9edc2d"

S = "${WORKDIR}/python-barbicanclient-5.5.0"

RDEPENDS_${PN} = "python3-cliff python3-keystoneauth1 python3-oslo-i18n python3-oslo-serialization python3-oslo-utils python3-pbr python3-requests"
DEPENDS = "python3-pip-native python3-pbr-native"


inherit setuptools3
