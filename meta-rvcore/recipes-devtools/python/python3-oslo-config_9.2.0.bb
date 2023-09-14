
SUMMARY = "Oslo Configuration API"
HOMEPAGE = "https://docs.openstack.org/oslo.config/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c46f31914956e4579f9b488e71415ac8"

SRC_URI = "https://files.pythonhosted.org/packages/86/df/3806c478e29866001cd0e04f22a9688851928a2da830aceb5a026d125a40/oslo.config-9.2.0.tar.gz"
SRC_URI[md5sum] = "9fd9306a5b71776bd793a02cd28d236c"
SRC_URI[sha256sum] = "ffeb01ca65a603d5525905f1a88a3319be09ce2c6ac376c4312aaec283095878"

S = "${WORKDIR}/oslo.config-9.2.0"

RDEPENDS_${PN} = "python3-pyyaml python3-debtcollector python3-netaddr python3-oslo-i18n python3-requests python3-rfc3986 python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
