
SUMMARY = "Import exceptions from potentially bundled packages in requests."
HOMEPAGE = "http://www.openstack.org/"
AUTHOR = "OpenStack <openstack-dev@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87"

SRC_URI = "https://files.pythonhosted.org/packages/82/ed/61b9652d3256503c99b0b8f145d9c8aa24c514caff6efc229989505937c1/requestsexceptions-1.4.0.tar.gz"
SRC_URI[md5sum] = "f43b246ccd7d5b618e6f0dc946a6c3f3"
SRC_URI[sha256sum] = "b095cbc77618f066d459a02b137b020c37da9f46d9b057704019c9f77dba3065"

S = "${WORKDIR}/requestsexceptions-1.4.0"

RDEPENDS_${PN} = ""
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
