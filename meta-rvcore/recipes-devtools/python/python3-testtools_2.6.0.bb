
SUMMARY = "Extensions to the Python standard library unit testing framework"
HOMEPAGE = "https://github.com/testing-cabal/testtools"
AUTHOR = "Jonathan M. Lange <jml+testtools@mumak.net>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e2c9d3e8ba7141c83bfef190e0b9379a"

SRC_URI = "https://files.pythonhosted.org/packages/cb/67/78e37d73f63d12cb2510e29aa0be14323719c6fdd33243118064b46f57d3/testtools-2.6.0.tar.gz"
SRC_URI[md5sum] = "2eb4224c3fbeb87424bdf4bca7b7c937"
SRC_URI[sha256sum] = "28b65e14c0f2d3ecbbfb5f55c9dcde5e4faa80ac16a37a823909a1fe3cbcb30a"

S = "${WORKDIR}/testtools-2.6.0"

RDEPENDS_${PN} = "python3-pbr python3-fixtures"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
