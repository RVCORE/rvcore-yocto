
SUMMARY = "Retrying"
HOMEPAGE = "https://github.com/groodt/retrying"
AUTHOR = "Greg Roodt <>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

SRC_URI = "https://files.pythonhosted.org/packages/ce/70/15ce8551d65b324e18c5aa6ef6998880f21ead51ebe5ed743c0950d7d9dd/retrying-1.3.4.tar.gz"
SRC_URI[md5sum] = "60ec4690e80e903117b91bc74a220116"
SRC_URI[sha256sum] = "345da8c5765bd982b1d1915deb9102fd3d1f7ad16bd84a9700b85f64d24e8f3e"

S = "${WORKDIR}/retrying-1.3.4"

RDEPENDS_${PN} = "python3-six"

inherit setuptools3
