
SUMMARY = "An SDK for building applications to work with OpenStack"
HOMEPAGE = "https://docs.openstack.org/openstacksdk/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/7d/48/bf2920dfd0e9a3a159a28b4099d573f43d6ce9e809083c3b0175f9607e11/openstacksdk-1.5.0.tar.gz"
SRC_URI[md5sum] = "316025acae40359ef37042a180bf825e"
SRC_URI[sha256sum] = "141b51fa28c6b1cdeb98ebdc38c1cee6a4e754bd6bc84ab7aaa0d0c2bce5443e"

S = "${WORKDIR}/openstacksdk-1.5.0"

RDEPENDS_${PN} = "python3-pyyaml python3-appdirs python3-cryptography python3-decorator python3-dogpile-cache python3-iso8601 python3-jmespath python3-jsonpatch python3-keystoneauth1 python3-netifaces python3-os-service-types python3-pbr python3-requestsexceptions"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3


RDEPENDS:${PN} = "bash"
