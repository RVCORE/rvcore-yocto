
SUMMARY = "Oslo Database library"
HOMEPAGE = "https://docs.openstack.org/oslo.db/latest"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/77/9c/f373a6794f1eea38e3fb860c4fd3789c1ab2663004e147215c3e9c4a439b/oslo.db-14.0.0.tar.gz"
SRC_URI[md5sum] = "53449983bcbcc7aa0216b70214d5a1aa"
SRC_URI[sha256sum] = "9c08a9cd838ebffad21eb3012fae002a0f77bf95696fa44d05b1b63a227e9fc1"

S = "${WORKDIR}/oslo.db-14.0.0"

RDEPENDS_${PN} = "python3-sqlalchemy python3-alembic python3-debtcollector python3-oslo-config python3-oslo-i18n python3-oslo-utils python3-pbr python3-stevedore python3-testresources python3-testscenarios"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
