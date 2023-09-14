
SUMMARY = "Validating URI References per RFC 3986"
HOMEPAGE = "http://rfc3986.readthedocs.io"
AUTHOR = "Ian Stapleton Cordasco <graffatcolmingov@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=03731a0e7dbcb30cecdcec77cc93ec29"

SRC_URI = "https://files.pythonhosted.org/packages/85/40/1520d68bfa07ab5a6f065a186815fb6610c86fe957bc065754e47f7b0840/rfc3986-2.0.0.tar.gz"
SRC_URI[md5sum] = "bbf20302bf26bc771e88cc775fbde3bc"
SRC_URI[sha256sum] = "97aacf9dbd4bfd829baad6e6309fa6573aaf1be3f6fa735c8ab05e46cecb261c"

S = "${WORKDIR}/rfc3986-2.0.0"

RDEPENDS_${PN} = ""

inherit setuptools3
