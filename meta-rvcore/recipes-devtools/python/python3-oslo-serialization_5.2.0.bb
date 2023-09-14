
SUMMARY = "Oslo Serialization library"
HOMEPAGE = "https://docs.openstack.org/oslo.serialization/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/1d/75/dff75372e7af48468da06f52c6a9abca63b7a4000165ce49e161011a4a10/oslo.serialization-5.2.0.tar.gz"
SRC_URI[md5sum] = "d7608a01181d3dd08e65437bfac630aa"
SRC_URI[sha256sum] = "9cf030d61a6cce1f47a62d4050f5e83e1bd1a1018ac671bb193aee07d15bdbc2"

S = "${WORKDIR}/oslo.serialization-5.2.0"

RDEPENDS_${PN} = "python3-msgpack python3-oslo-utils python3-pbr python3-pytz python3-tzdata"
DEPENDS = "python3-pip-native python3-pbr-native"
inherit setuptools3
