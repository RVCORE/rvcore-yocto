
SUMMARY = "A library containing standardized trait strings"
HOMEPAGE = "https://docs.openstack.org/os-traits/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/c3/8f/33b57ca528b25269ec3558616e99172edf2b3c2edc3f5a4af95fe7ded129/os-traits-3.0.0.tar.gz"
SRC_URI[md5sum] = "4719c11eaa0b0a6416c989fbdf5a1b7c"
SRC_URI[sha256sum] = "4a69bb8a1499bba1616302967c76ab65374269c66924ceb174677e37f6b975c9"

S = "${WORKDIR}/os-traits-3.0.0"

RDEPENDS_${PN} = "python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
