
SUMMARY = "A library for creating OVSDB applications"
HOMEPAGE = "https://pypi.org/project/ovsdbapp/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/57/2a/cc2fe33d1d14781a7d78f14cfc491b2c567c31ccff2e7d4ef2509809e092/ovsdbapp-2.4.1.tar.gz"
SRC_URI[md5sum] = "423056d5d0631856fa5def47cb5bdd71"
SRC_URI[sha256sum] = "ab9838416f84db54103de64b6da1326c94849e9102d1b51bc35edde7dd711cee"

S = "${WORKDIR}/ovsdbapp-2.4.1"

RDEPENDS_${PN} = "python3-fixtures python3-netaddr python3-ovs python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native"


inherit setuptools3
