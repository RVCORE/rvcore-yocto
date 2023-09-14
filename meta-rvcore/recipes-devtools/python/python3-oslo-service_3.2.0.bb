
SUMMARY = "oslo.service library"
HOMEPAGE = "https://docs.openstack.org/oslo.service/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/bb/97/5a38768442acd0a2ef510b6ad7ab6adf3b288f367bed8a61d451c50b08d8/oslo.service-3.2.0.tar.gz"
SRC_URI[md5sum] = "687bdbcb6c605a37147e1d909b1ecca5"
SRC_URI[sha256sum] = "e9c62a37663ff1de8855ada04d3b4c1ccde6c28c9811a6bcef1652bce741f6f3"

S = "${WORKDIR}/oslo.service-3.2.0"

RDEPENDS_${PN} = "python3-paste python3-pastedeploy python3-routes python3-webob python3-yappi python3-debtcollector python3-eventlet python3-fixtures python3-greenlet python3-oslo-concurrency python3-oslo-config python3-oslo-i18n python3-oslo-log python3-oslo-utils"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
