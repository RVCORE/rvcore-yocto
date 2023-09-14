
SUMMARY = "OpenStack Cinder brick library for managing local volume attaches"
HOMEPAGE = "https://docs.openstack.org/os-brick/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/ee/40/067313fcbb18cab6ca9d2e0730052cf5bd9c15a2e66c156f942dbac0f6b3/os-brick-6.4.0.tar.gz"
SRC_URI[md5sum] = "3d307e08731093cf3ea3dd89eac30df9"
SRC_URI[sha256sum] = "fc66ea2fe780e2816be4ecca88407ac9f086f2c7ac1d1fd047d87bde9469cbeb"

S = "${WORKDIR}/os-brick-6.4.0"

RDEPENDS_${PN} = "python3-os-win python3-oslo-concurrency python3-oslo-config python3-oslo-context python3-oslo-i18n python3-oslo-log python3-oslo-privsep python3-oslo-serialization python3-oslo-service python3-oslo-utils python3-pbr python3-requests python3-tenacity"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3


FILES:${PN} += " /usr/etc/os-brick/rootwrap.d/os-brick.filters"
