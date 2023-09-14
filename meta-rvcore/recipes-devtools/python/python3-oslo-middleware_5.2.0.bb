
SUMMARY = "Oslo Middleware library"
HOMEPAGE = "https://docs.openstack.org/oslo.middleware/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/37/35/3fee0e5cf09d304108316e536bbbc4fe4cd6744e88b2e4c74c6f6f048cb1/oslo.middleware-5.2.0.tar.gz"
SRC_URI[md5sum] = "40bc66ab605dfe20bea6b5e0fe6b1459"
SRC_URI[sha256sum] = "eb4458e23ac0b6dbd7f76e961e861060c5f8b0dd087e4e7a5ab471f1efb698c3"

S = "${WORKDIR}/oslo.middleware-5.2.0"

RDEPENDS_${PN} = "python3-jinja2 python3-webob python3-bcrypt python3-debtcollector python3-oslo-config python3-oslo-context python3-oslo-i18n python3-oslo-utils python3-pbr python3-statsd python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"
inherit setuptools3
