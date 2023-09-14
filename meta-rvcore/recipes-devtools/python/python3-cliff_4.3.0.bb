
SUMMARY = "Command Line Interface Formulation Framework"
HOMEPAGE = "https://docs.openstack.org/cliff/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/19/9b/6bc3c126eacaede94eb5374d5a222911b47dc1a47a6773b8b122d0e3e4e8/cliff-4.3.0.tar.gz"
SRC_URI[md5sum] = "37a10c1b431b34597db3822b47abb415"
SRC_URI[sha256sum] = "fc5b6ebc8fb815332770b2485ee36c09753937c37cce4f3227cdd4e10b33eacc"

S = "${WORKDIR}/cliff-4.3.0"

RDEPENDS_${PN} = "python3-prettytable python3-pyyaml python3-autopage python3-cmd2 python3-importlib-metadata python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
