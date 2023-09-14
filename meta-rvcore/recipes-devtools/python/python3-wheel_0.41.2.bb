
SUMMARY = "A built-package format for Python"
HOMEPAGE = ""
AUTHOR = " <Daniel Holth <dholth@fastmail.fm>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7ffb0db04527cfe380e4f2726bd05ebf"

SRC_URI = "https://files.pythonhosted.org/packages/a4/99/78c4f3bd50619d772168bec6a0f34379b02c19c9cced0ed833ecd021fd0d/wheel-0.41.2.tar.gz"
SRC_URI[md5sum] = "06271a9e90c948b7e93dd7ce0fd90272"
SRC_URI[sha256sum] = "0c5ac5ff2afb79ac23ab82bab027a0be7b5dbcf2e54dc50efe4bf507de1f7985"

S = "${WORKDIR}/wheel-0.41.2"

RDEPENDS_${PN} = ""

inherit setuptools3
