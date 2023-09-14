
SUMMARY = "Client Library for OpenStack Identity"
HOMEPAGE = "https://docs.openstack.org/python-keystoneclient/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a4d0e932ffae1c0131528d30d419c55"

SRC_URI = "https://files.pythonhosted.org/packages/bb/57/f59abb588eb28c1b5a8432e3163a2135183672e2dceb747aed0b26f3db01/python-keystoneclient-5.1.0.tar.gz"
SRC_URI[md5sum] = "11ed4119004ba511e616afd75411a4d4"
SRC_URI[sha256sum] = "ba09bdfeafa2a2196450a327cd3f46f2a8a9dd9d21b838f8cb9b17a99740c6a1"

S = "${WORKDIR}/python-keystoneclient-5.1.0"

RDEPENDS_${PN} = "python3-debtcollector python3-keystoneauth1 python3-oslo-config python3-oslo-i18n python3-oslo-serialization python3-oslo-utils python3-packaging python3-pbr python3-requests python3-six python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
