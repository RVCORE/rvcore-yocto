
SUMMARY = "OpenStack Profiler Library"
HOMEPAGE = "https://docs.openstack.org/osprofiler/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=19cbd64715b51267a47bf3750cc6a8a5"

SRC_URI = "https://files.pythonhosted.org/packages/ea/af/ec4d9ecdc3932b9a454d164d563066f9ef077a056f9340fcae4e50f1aabf/osprofiler-4.1.0.tar.gz"
SRC_URI[md5sum] = "46e3ed2bd3103b948f7ebe630ae9fae7"
SRC_URI[sha256sum] = "57837b620581b13444a2e20564775d4fc73eff67c7888af99947ed582fe514b0"

S = "${WORKDIR}/osprofiler-4.1.0"

RDEPENDS_${PN} = "python3-prettytable python3-webob python3-netaddr python3-oslo-concurrency python3-oslo-serialization python3-oslo-utils python3-requests"
DEPENDS = "python3-pip-native python3-pbr-native"


inherit setuptools3
