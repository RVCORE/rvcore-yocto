
SUMMARY = "Cache storage for OpenStack projects."
HOMEPAGE = "https://docs.openstack.org/oslo.cache/latest"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/2f/47/a07614298fbd155c6ad547de2670c45fd0e5f04809c51645d0982f4537a5/oslo.cache-3.5.0.tar.gz"
SRC_URI[md5sum] = "50cf567c7d6ce7b5bd23e4d3e3d12389"
SRC_URI[sha256sum] = "8899a130fe463dd91a2d7d33127e25733ebb35d80bc9eeb40992fe8d23a52f02"

S = "${WORKDIR}/oslo.cache-3.5.0"

RDEPENDS_${PN} = "python3-dogpile-cache python3-oslo-config python3-oslo-i18n python3-oslo-log python3-oslo-utils"
DEPENDS = "python3-pip-native python3-pbr-native"


inherit setuptools3
