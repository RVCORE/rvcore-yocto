
SUMMARY = "A WSGI object-dispatching web framework, designed to be lean and fast, with few dependencies."
HOMEPAGE = "http://github.com/pecan/pecan"
AUTHOR = "Jonathan LaCour <info@pecanpy.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d846877d24bbb3d7a00a985c90378e8c"

SRC_URI = "https://files.pythonhosted.org/packages/11/cb/a0e1972713b25029dd43554da94fdd4a280faa6395218f8f400941e2779b/pecan-1.5.1.tar.gz"
SRC_URI[md5sum] = "031405e39beb804138ed7dc194101691"
SRC_URI[sha256sum] = "6063272d5f860773fbb4b4b2ae1b09da8c954062ef871150c06cfdb2391d9355"

S = "${WORKDIR}/pecan-1.5.1"

RDEPENDS_${PN} = "python3-webob python3-mako python3-setuptools python3-logutils"

inherit setuptools3
