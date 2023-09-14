
SUMMARY = "Useful additions to futures, from the future."
HOMEPAGE = "https://docs.openstack.org/futurist/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/e7/08/141b42af4fbaa9f7b8b9ffbf32197d261269e1088a3d4f2287fcfcbf542b/futurist-2.4.1.tar.gz"
SRC_URI[md5sum] = "3d541a8c1e13c2b7cde000a85eab295c"
SRC_URI[sha256sum] = "9c1760a877c0fe3260d04b6a6d4352a6d25ac58e483f1d6cd495e33dc3740ff7"

S = "${WORKDIR}/futurist-2.4.1"
DEPENDS = "python3-pip-native python3-pbr-native"
RDEPENDS_${PN} = ""

inherit setuptools3
