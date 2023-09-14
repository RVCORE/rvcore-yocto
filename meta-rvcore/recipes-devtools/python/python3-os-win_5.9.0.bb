
SUMMARY = "Windows / Hyper-V library for OpenStack projects."
HOMEPAGE = "http://www.cloudbase.it/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/7f/7b/49eff6bd3f40bf00ae0bdf4730d65789b14767169a651bec0ff629c05818/os-win-5.9.0.tar.gz"
SRC_URI[md5sum] = "fad432cf40fef0f7d0c396f6df1994a8"
SRC_URI[sha256sum] = "4d4ad5122060cdd1312d6909921c7280c7159fa6811a966fa11688fc141808c0"

S = "${WORKDIR}/os-win-5.9.0"

RDEPENDS_${PN} = "python3-eventlet python3-oslo-concurrency python3-oslo-config python3-oslo-i18n python3-oslo-log python3-oslo-utils python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
