
SUMMARY = "Coordination library for distributed systems."
HOMEPAGE = "https://docs.openstack.org/tooz/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/05/6e/1f7cc973771a8e006355e4061a50aaeeced64f7cafbf71bee1edbefddcf2/tooz-4.2.0.tar.gz"
SRC_URI[md5sum] = "a578513d0b7682c4ebb3735bcf4c7a6a"
SRC_URI[sha256sum] = "b279f3a3fb5d623043af1f14a911e54b7eff29542f127e8c670a1f29695694a1"

S = "${WORKDIR}/tooz-4.2.0"

RDEPENDS_${PN} = "python3-fasteners python3-futurist python3-msgpack python3-oslo-serialization python3-oslo-utils python3-pbr python3-stevedore python3-tenacity python3-voluptuous"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
