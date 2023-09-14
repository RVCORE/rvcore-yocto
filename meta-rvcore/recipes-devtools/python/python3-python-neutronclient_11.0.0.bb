
SUMMARY = "CLI and Client Library for OpenStack Networking"
HOMEPAGE = "https://docs.openstack.org/python-neutronclient/latest/"
AUTHOR = "OpenStack Networking Project <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/8e/f6/79737dc54119094319798734548becba0cfb0f7064e6addbacbcb13d0682/python-neutronclient-11.0.0.tar.gz"
SRC_URI[md5sum] = "6ccf7df8057646ec7cce685ad22e0077"
SRC_URI[sha256sum] = "6dacdf88f3725447a2fb29fc0d76996fcf4f3977f098ca3df4b1f39eb8dbba32"

S = "${WORKDIR}/python-neutronclient-11.0.0"

RDEPENDS_${PN} = "python3-cliff python3-debtcollector python3-iso8601 python3-keystoneauth1 python3-netaddr python3-openstacksdk python3-os-client-config python3-osc-lib python3-oslo-i18n python3-oslo-log python3-oslo-serialization python3-oslo-utils python3-pbr python3-python-keystoneclient python3-requests python3-simplejson"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
