
SUMMARY = "OpenStack Client Configuation Library"
HOMEPAGE = "https://docs.openstack.org/os-client-config/latest"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/58/be/ba2e4d71dd57653c8fefe8577ade06bf5f87826e835b3c7d5bb513225227/os-client-config-2.1.0.tar.gz"
SRC_URI[md5sum] = "cb8e78d37424f9f8c28b1ff05d662b66"
SRC_URI[sha256sum] = "abc38a351f8c006d34f7ee5f3f648de5e3ecf6455cc5d76cfd889d291cdf3f4e"

S = "${WORKDIR}/os-client-config-2.1.0"

RDEPENDS_${PN} = "python3-openstacksdk"
DEPENDS = "python3-pip-native python3-pbr-native"


inherit setuptools3
