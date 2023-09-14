
SUMMARY = "OpenStack Image API Client Library"
HOMEPAGE = "https://docs.openstack.org/python-glanceclient/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/76/b6/582ca4c2a5fe5010247e4459836acf8e6abb88462c9a25094e023a63abc6/python-glanceclient-4.4.0.tar.gz"
SRC_URI[md5sum] = "512b568cf21af7fc387b548a0312f3fa"
SRC_URI[sha256sum] = "7a366e1ff66bdb76e627eecf7cd4053bd94f35fa3cdc690d29aff47e976e0532"

S = "${WORKDIR}/python-glanceclient-4.4.0"

RDEPENDS_${PN} = "python3-prettytable python3-keystoneauth1 python3-oslo-i18n python3-oslo-utils python3-pbr python3-pyopenssl python3-requests python3-warlock python3-wrapt"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
