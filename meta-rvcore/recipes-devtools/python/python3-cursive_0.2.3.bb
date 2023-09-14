
SUMMARY = "Cursive implements OpenStack-specific validation of digital signatures."
HOMEPAGE = "http://www.openstack.org/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/fc/3d/dd3b74dab4240ca2eeb291a643e0a8780fe5a83f5d3efeb358b5bc8d2a17/cursive-0.2.3.tar.gz"
SRC_URI[md5sum] = "c90171b9c3e124169d97b5c6026ba66c"
SRC_URI[sha256sum] = "f435f6cdbe6a517f054c1105c36e436d7868124f1b227d310fe809d918a8c10c"

S = "${WORKDIR}/cursive-0.2.3"

RDEPENDS_${PN} = "python3-castellan python3-cryptography python3-oslo-i18n python3-oslo-log python3-oslo-serialization python3-oslo-utils python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
