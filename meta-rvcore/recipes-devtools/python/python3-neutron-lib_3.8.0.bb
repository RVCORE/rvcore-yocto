
SUMMARY = "Neutron shared routines and utilities"
HOMEPAGE = "https://docs.openstack.org/neutron-lib/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/1a/1d/d6ab453d68f10625d5572b67f9744d7b3a6e3b76b301b90cf205998f65d4/neutron-lib-3.8.0.tar.gz"
SRC_URI[md5sum] = "e903137b70990cfe361962cbbadfa21a"
SRC_URI[sha256sum] = "11f56a2e114405a13b39fb111ddc181628903566d798eb289ef10bf375377b77"

S = "${WORKDIR}/neutron-lib-3.8.0"

RDEPENDS_${PN} = "python3-sqlalchemy python3-webob python3-keystoneauth1 python3-netaddr python3-os-ken python3-os-traits python3-oslo-concurrency python3-oslo-config python3-oslo-context python3-oslo-db python3-oslo-i18n python3-oslo-log python3-oslo-messaging python3-oslo-policy python3-oslo-serialization python3-oslo-service python3-oslo-utils python3-oslo-versionedobjects python3-osprofiler python3-pbr python3-pecan python3-setproctitle python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"


inherit setuptools3
