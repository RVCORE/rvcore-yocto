
SUMMARY = "Authentication Library for OpenStack Identity"
HOMEPAGE = "https://docs.openstack.org/keystoneauth/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96f840d59b245a1c817fbcb901afc574"

SRC_URI = "https://files.pythonhosted.org/packages/9b/b3/ddee6a16e07fea73295476394ab75c8294a396fc164d6547b73922ab3ee5/keystoneauth1-5.3.0.tar.gz"
SRC_URI[md5sum] = "8ded5297b8f9620137120138cd7efa54"
SRC_URI[sha256sum] = "017c2b9b599453c92940750edbb20f17687121b2890114bf9d36df14a0627117"

S = "${WORKDIR}/keystoneauth1-5.3.0"

RDEPENDS_${PN} = "python3-iso8601 python3-os-service-types python3-pbr python3-requests python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
