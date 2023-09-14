
SUMMARY = "OpenStackClient Library"
HOMEPAGE = "https://docs.openstack.org/osc-lib/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/5b/e7/292866a605a727fd8fdf55031d40bf48fb085cfc6509436c510813d05ccf/osc-lib-2.8.1.tar.gz"
SRC_URI[md5sum] = "593d87f20a2e8e5e1c6c22de3223cb0b"
SRC_URI[sha256sum] = "6f556012ee0401bf1bf5c442eae020d2ccc866992a2441033d8861b04749fdcc"

S = "${WORKDIR}/osc-lib-2.8.1"

RDEPENDS_${PN} = "python3-cliff python3-keystoneauth1 python3-openstacksdk python3-oslo-i18n python3-oslo-utils python3-pbr python3-simplejson python3-stevedore"

DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
