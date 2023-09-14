
SUMMARY = "A library for plugging and unplugging virtual interfaces in OpenStack."
HOMEPAGE = "https://docs.openstack.org/os-vif/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/07/27/fa9e31cfdc6030f924d4ac1682aa379ea3ae8ab7ead68bb6c61d057fb565/os_vif-3.2.0.tar.gz"
SRC_URI[md5sum] = "2edf82c0189f6f29786b88818f0f1cc7"
SRC_URI[sha256sum] = "e1146276f7695457ef4191dc92ff6ad94ea74d79b5d699b303ce69aa3195e8d6"

S = "${WORKDIR}/os_vif-3.2.0"

RDEPENDS_${PN} = "python3-debtcollector python3-netaddr python3-oslo-concurrency python3-oslo-config python3-oslo-i18n python3-oslo-log python3-oslo-privsep python3-oslo-versionedobjects python3-ovsdbapp python3-pbr python3-stevedore"

DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
