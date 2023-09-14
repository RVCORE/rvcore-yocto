
SUMMARY = "Python object model built on JSON schema and JSON patch."
HOMEPAGE = "http://github.com/bcwaldon/warlock"
AUTHOR = "Brian Waldon <bcwaldon@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/de/cf/ba9ac96d09b797c377e2c12c0eb6b19565f3b2a2efb55932d319e319b622/warlock-2.0.1.tar.gz"
SRC_URI[md5sum] = "78aa9050a11f1599d2b2ebb6def6b411"
SRC_URI[sha256sum] = "99abbf9525b2a77f2cde896d3a9f18a5b4590db063db65e08207694d2e0137fc"

S = "${WORKDIR}/warlock-2.0.1"

RDEPENDS_${PN} = "python3-jsonpatch python3-jsonschema"

inherit setuptools3
