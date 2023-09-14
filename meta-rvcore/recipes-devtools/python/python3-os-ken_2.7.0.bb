
SUMMARY = "A component-based software defined networking framework for OpenStack."
HOMEPAGE = "http://www.openstack.org/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/d9/f4/38b199ad3d76c8cde54859dd7e09dd1b45123f1bab4d34f2e7b9a08820a8/os-ken-2.7.0.tar.gz"
SRC_URI[md5sum] = "3094d512e887095f56622dbdbe16900a"
SRC_URI[sha256sum] = "f92ddeee869818004059cf3b605f4ec552ff7799e6bb014a122ac3215af517b7"

S = "${WORKDIR}/os-ken-2.7.0"

RDEPENDS_${PN} = "python3-routes python3-webob python3-eventlet python3-msgpack python3-ncclient python3-netaddr python3-oslo-config python3-ovs python3-packaging python3-pbr"
DEPENDS = "python3-pbr-native"


inherit pypi python_setuptools_build_meta
