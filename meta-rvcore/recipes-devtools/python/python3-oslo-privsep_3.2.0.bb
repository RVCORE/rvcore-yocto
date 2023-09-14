
SUMMARY = "OpenStack library for privilege separation"
HOMEPAGE = "https://docs.openstack.org/oslo.privsep/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/5d/c0/43ae2fde155f43124cc4c72f7c10e5ebd8697419dbbb9e6daad0e5783aac/oslo.privsep-3.2.0.tar.gz"
SRC_URI[md5sum] = "434c706234ca2345a32a9cdcee54a103"
SRC_URI[sha256sum] = "3b2b80cf3101ea64354296eb7f1c7c8da6c8d7c62ff921374509a3c7b38f3e16"

S = "${WORKDIR}/oslo.privsep-3.2.0"

RDEPENDS_${PN} = "python3-cffi python3-eventlet python3-greenlet python3-msgpack python3-oslo-config python3-oslo-i18n python3-oslo-log python3-oslo-utils"
DEPENDS = "python3-pip-native python3-pbr-native"


inherit setuptools3
