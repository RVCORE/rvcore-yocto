
SUMMARY = "Oslo Utility library"
HOMEPAGE = "https://docs.openstack.org/oslo.utils/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/4b/d0/efe8943f8f4130708440870bb8f8167b16204b556fb94236554f4b213756/oslo.utils-6.2.1.tar.gz"
SRC_URI[md5sum] = "f4e5d3dcdaf6b5e29a952f599a1ef51d"
SRC_URI[sha256sum] = "1322ba05fa0ff3c1a8afc727fcf945df5aa82d6584727d2e04af038b5ae84244"

S = "${WORKDIR}/oslo.utils-6.2.1"

RDEPENDS_${PN} = "python3-debtcollector python3-iso8601 python3-netaddr python3-netifaces python3-oslo-i18n python3-packaging python3-pyparsing python3-pytz python3-tzdata"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
