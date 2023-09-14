
SUMMARY = "Measures the displayed width of unicode strings in a terminal"
HOMEPAGE = "https://github.com/jquast/wcwidth"
AUTHOR = "Jeff Quast <contact@jeffquast.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b15979c39a2543892fca8cd86b4b52cb"

SRC_URI = "https://files.pythonhosted.org/packages/5e/5f/1e4bd82a9cc1f17b2c2361a2d876d4c38973a997003ba5eb400e8a932b6c/wcwidth-0.2.6.tar.gz"
SRC_URI[md5sum] = "976b997f2ed155b5c2e9a4d50e528d90"
SRC_URI[sha256sum] = "a5220780a404dbe3353789870978e472cfe477761f06ee55077256e509b156d0"

S = "${WORKDIR}/wcwidth-0.2.6"

RDEPENDS_${PN} = ""

inherit setuptools3
