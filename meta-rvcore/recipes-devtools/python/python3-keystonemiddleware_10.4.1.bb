
SUMMARY = "Middleware for OpenStack Identity"
HOMEPAGE = "https://docs.openstack.org/keystonemiddleware/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a4d0e932ffae1c0131528d30d419c55"

SRC_URI = "https://files.pythonhosted.org/packages/3e/0f/e2710a3d119a993ab1eed0eb4ec23cc50bd9f770eff4c7b330a58cc2cdba/keystonemiddleware-10.4.1.tar.gz"
SRC_URI[md5sum] = "94028b707fa9da344fe544b9196591cd"
SRC_URI[sha256sum] = "7d965500050ab970db3ef644f35168c38e04230436bd1116136049fd9c43eed6"

S = "${WORKDIR}/keystonemiddleware-10.4.1"

RDEPENDS_${PN} = "python3-webob python3-keystoneauth1 python3-oslo-cache python3-oslo-config python3-oslo-context python3-oslo-i18n python3-oslo-log python3-oslo-serialization python3-oslo-utils python3-pbr python3-pycadf python3-python-keystoneclient python3-requests"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
