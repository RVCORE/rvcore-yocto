
SUMMARY = "OpenStack microversion header parser"
HOMEPAGE = "http://www.openstack.org/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "https://files.pythonhosted.org/packages/1c/bb/ffeb8ac7acfe77425220352f1338e164ceb1177fdb69f7bcbc6750ca878d/microversion_parse-1.0.1.tar.gz"
SRC_URI[md5sum] = "57c6d82f0eb92306d47f1d1933810be5"
SRC_URI[sha256sum] = "ec6bc0711019f620d6690087b958f934634a242e49a7c1c60c1688363cbe102d"

S = "${WORKDIR}/microversion_parse-1.0.1"

RDEPENDS_${PN} = "python3-webob"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
