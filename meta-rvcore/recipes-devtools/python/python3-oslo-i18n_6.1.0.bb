
SUMMARY = "Oslo i18n library"
HOMEPAGE = "https://docs.openstack.org/oslo.i18n/latest"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/f3/84/6949f4ae2ab3fe2996a1200a6e2cd6acc9982d3a07790e43d807c7f9b99b/oslo.i18n-6.1.0.tar.gz"
SRC_URI[md5sum] = "365703b755f43186e63022bab8f450a6"
SRC_URI[sha256sum] = "e2b829f205bf1eb6204756cc34027d119494b62d271feee860bf816ca7a07ead"

S = "${WORKDIR}/oslo.i18n-6.1.0"

RDEPENDS_${PN} = "python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
