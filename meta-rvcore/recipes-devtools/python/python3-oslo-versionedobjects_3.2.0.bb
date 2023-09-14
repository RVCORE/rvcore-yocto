
SUMMARY = "Oslo Versioned Objects library"
HOMEPAGE = "https://docs.openstack.org/oslo.versionedobjects/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/69/f3/1ecde6b0a5ecbf29a21f08c7741c30433f6a5e0e9e2e4953803587e96fd4/oslo.versionedobjects-3.2.0.tar.gz"
SRC_URI[md5sum] = "6374835e0de9747ddd1d20a32c311eba"
SRC_URI[sha256sum] = "ea2e8a619467cb1d4059ce046ef901aed39530ad1ccbadaeba7d344c5a12facb"

S = "${WORKDIR}/oslo.versionedobjects-3.2.0"

RDEPENDS_${PN} = "python3-webob python3-iso8601 python3-netaddr python3-oslo-concurrency python3-oslo-config python3-oslo-context python3-oslo-i18n python3-oslo-log python3-oslo-messaging python3-oslo-serialization python3-oslo-utils"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
