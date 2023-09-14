
SUMMARY = "Generic Key Manager interface for OpenStack"
HOMEPAGE = "https://docs.openstack.org/castellan/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/fa/1a/02da19ad0e7a14df9e5053105aed4be75aad5d1ae6551a318bf5753a33a9/castellan-4.2.0.tar.gz"
SRC_URI[md5sum] = "0452e1101d4f2b5517319c1172f091b7"
SRC_URI[sha256sum] = "dac7460dce7f61ef56fff64e234ee606ab665b9d5e8ee855f100b71e28d17338"

S = "${WORKDIR}/castellan-4.2.0"

RDEPENDS_${PN} = "python3-cryptography python3-keystoneauth1 python3-oslo-config python3-oslo-context python3-oslo-i18n python3-oslo-log python3-oslo-utils python3-pbr python3-python-barbicanclient python3-requests python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"
RDEPENDS:${PN} = "bash"

inherit setuptools3
