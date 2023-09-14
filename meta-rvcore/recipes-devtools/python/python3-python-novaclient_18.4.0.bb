
SUMMARY = "Client library for OpenStack Compute API"
HOMEPAGE = "https://docs.openstack.org/python-novaclient/latest"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7cdb54622cacc9bc9b2883091e6dd669"

SRC_URI = "https://files.pythonhosted.org/packages/c4/c6/4ee6c69bfc7a9e9dde92d946594735f638dcf4959e6e8da1b1d920b3f0d9/python-novaclient-18.4.0.tar.gz"
SRC_URI[md5sum] = "18ed0f40a281dc565fb533e2104f9f06"
SRC_URI[sha256sum] = "6b6b6ae2c11eb1c108e3af55eaa7211b0fc9199935a229a6ba3e0de514c12b50"

S = "${WORKDIR}/python-novaclient-18.4.0"

RDEPENDS_${PN} = "python3-prettytable python3-iso8601 python3-keystoneauth1 python3-oslo-i18n python3-oslo-serialization python3-oslo-utils python3-pbr python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"


inherit setuptools3
