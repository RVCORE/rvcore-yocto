
SUMMARY = "CADF Library"
HOMEPAGE = "https://docs.openstack.org/pycadf/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c46f31914956e4579f9b488e71415ac8"

SRC_URI = "https://files.pythonhosted.org/packages/83/5a/45506b000bf13fee4da64304aec169f9cddd0704add9a0339fd61f76a25c/pycadf-3.1.1.tar.gz"
SRC_URI[md5sum] = "af685f444aefdec58859d1c2419ba011"
SRC_URI[sha256sum] = "2be491143d21fa3dd1f842ce8dd4973e95f580893887960faa5c11a6190081e8"

S = "${WORKDIR}/pycadf-3.1.1"

RDEPENDS_${PN} = "python3-debtcollector python3-oslo-config python3-oslo-serialization python3-pytz python3-six"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3

FILES:${PN} += "/usr/etc/pycadf/*.conf"
