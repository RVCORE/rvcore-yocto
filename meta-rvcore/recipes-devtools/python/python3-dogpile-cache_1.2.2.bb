
SUMMARY = "A caching front-end based on the Dogpile lock."
HOMEPAGE = "https://github.com/sqlalchemy/dogpile.cache"
AUTHOR = "Mike Bayer <mike_mp@zzzcomputing.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6662afa5ff1862e6612565aee800ed0a"

SRC_URI = "https://files.pythonhosted.org/packages/d2/f8/f3e877361372737d83f6592d6ba2126b2018d2208472a5dcb82773694281/dogpile.cache-1.2.2.tar.gz"
SRC_URI[md5sum] = "ca2b1bf003c141dd5a0be6453e851fe4"
SRC_URI[sha256sum] = "fd9022c0d9cbadadf20942391a95adaf296be80b42daa8e202f8de1c21f198b2"

S = "${WORKDIR}/dogpile.cache-1.2.2"

RDEPENDS_${PN} = ""

inherit setuptools3
