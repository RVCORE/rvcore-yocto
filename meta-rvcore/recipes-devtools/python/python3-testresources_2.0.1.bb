
SUMMARY = "Testresources, a pyunit extension for managing expensive test resources"
HOMEPAGE = "https://launchpad.net/testresources"
AUTHOR = "Testresources developers <https://launchpad.net/~testresources-developers>"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://COPYING;md5=45c0758e5bcf0fd37262291b69cbea25"

SRC_URI = "https://files.pythonhosted.org/packages/9d/57/8e3986cd95a80dd23195f599befa023eb85d031d2d870c47124fa5ccbf06/testresources-2.0.1.tar.gz"
SRC_URI[md5sum] = "8873ab443db5569528964f524228a2d7"
SRC_URI[sha256sum] = "ee9d1982154a1e212d4e4bac6b610800bfb558e4fb853572a827bc14a96e4417"

S = "${WORKDIR}/testresources-2.0.1"

RDEPENDS_${PN} = ""
DEPENDS = "python3-pip-native python3-pbr-native"


inherit setuptools3
