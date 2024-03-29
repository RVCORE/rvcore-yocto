
SUMMARY = "Sorted Containers -- Sorted List, Sorted Dict, Sorted Set"
HOMEPAGE = "http://www.grantjenks.com/docs/sortedcontainers/"
AUTHOR = "Grant Jenks <contact@grantjenks.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c7c6a1a12ec816da16c1839137d53ae"

SRC_URI = "https://files.pythonhosted.org/packages/e8/c4/ba2f8066cceb6f23394729afe52f3bf7adec04bf9ed2c820b39e19299111/sortedcontainers-2.4.0.tar.gz"
SRC_URI[md5sum] = "50eeb6cb739568b590b28f9a3f445c78"
SRC_URI[sha256sum] = "25caa5a06cc30b6b83d11423433f65d1f9d76c4c6a0c90e3379eaa43b9bfdb88"

S = "${WORKDIR}/sortedcontainers-2.4.0"

RDEPENDS_${PN} = ""

inherit setuptools3
