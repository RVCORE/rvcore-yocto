
SUMMARY = "Oslo Concurrency library"
HOMEPAGE = "https://docs.openstack.org/oslo.concurrency/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/10/d9/a16b3bd62b56ada77f0b08edfcbfcc78b84ebb14140b0570baae9fd2b01c/oslo.concurrency-5.2.0.tar.gz"
SRC_URI[md5sum] = "2dbdc94b68b548d5012c6e538a33a5ce"
SRC_URI[sha256sum] = "8a19ec574ed057e93d5167432605ff874c4b9017a5215fd021a2034c6cd52a92"

S = "${WORKDIR}/oslo.concurrency-5.2.0"

RDEPENDS_${PN} = "python3-fasteners python3-oslo-config python3-oslo-i18n python3-oslo-utils python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
