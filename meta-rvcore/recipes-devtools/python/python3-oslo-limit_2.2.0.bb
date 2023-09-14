
SUMMARY = "Limit enforcement library to assist with quota calculation."
HOMEPAGE = "https://docs.openstack.org/oslo.limit/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/2c/46/2dfc94e462814e28c189cc09b9feb923cc1730129564a25cf97eb922c038/oslo.limit-2.2.0.tar.gz"
SRC_URI[md5sum] = "3e6a506d056812f4bf98516d77555efb"
SRC_URI[sha256sum] = "a386b82117becb264bdf2c72cea2daecc6e08ba5fcee07654626e20d7c3223e4"

S = "${WORKDIR}/oslo.limit-2.2.0"

RDEPENDS_${PN} = "python3-keystoneauth1 python3-openstacksdk python3-oslo-config python3-oslo-i18n python3-oslo-log"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
