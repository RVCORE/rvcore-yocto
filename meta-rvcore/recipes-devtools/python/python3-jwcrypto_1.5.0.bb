
SUMMARY = "Implementation of JOSE Web standards"
HOMEPAGE = "https://github.com/latchset/jwcrypto"
AUTHOR = " <>"
LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "https://files.pythonhosted.org/packages/ed/72/b9289ee27d228fc7cae5c83d1c640de2a7cc0621805aa839ba239d6ef8fc/jwcrypto-1.5.0.tar.gz"
SRC_URI[md5sum] = "7a5511484efde92f01f18584a01cc469"
SRC_URI[sha256sum] = "2c1dc51cf8e38ddf324795dfe9426dee9dd46caf47f535ccbc18781fba810b8d"

S = "${WORKDIR}/jwcrypto-1.5.0"

RDEPENDS_${PN} = ""

inherit setuptools3
