
SUMMARY = "Manage dynamic plugins for Python applications"
HOMEPAGE = "https://docs.openstack.org/stevedore/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/ac/d6/77387d3fc81f07bc8877e6f29507bd7943569093583b0a07b28cfa286780/stevedore-5.1.0.tar.gz"
SRC_URI[md5sum] = "41775a62252994412daa300ff904170c"
SRC_URI[sha256sum] = "a54534acf9b89bc7ed264807013b505bf07f74dbe4bcfa37d32bd063870b087c"

S = "${WORKDIR}/stevedore-5.1.0"

RDEPENDS_${PN} = "python3-pbr"
DEPENDS = "python3-pip-native python3-pbr-native python3-setuptools-scm"


inherit setuptools3
