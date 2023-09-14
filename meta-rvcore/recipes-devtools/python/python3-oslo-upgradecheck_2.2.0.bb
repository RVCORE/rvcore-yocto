
SUMMARY = "Common code for writing OpenStack upgrade checks"
HOMEPAGE = "http://launchpad.net/oslo"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/8d/06/adbb87a599198c41c899c600c4393f19599620fee174da372b4535aa0bd5/oslo.upgradecheck-2.2.0.tar.gz"
SRC_URI[md5sum] = "9622679cd28ac03c65b31e1812983d15"
SRC_URI[sha256sum] = "b48fc9fe4b619b3e429de6acf6473353d74b09135e3aee6a3abb520dbfc25c28"

S = "${WORKDIR}/oslo.upgradecheck-2.2.0"

RDEPENDS_${PN} = "python3-prettytable python3-oslo-config python3-oslo-i18n python3-oslo-policy python3-oslo-utils"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
