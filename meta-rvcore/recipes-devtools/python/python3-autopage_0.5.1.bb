
SUMMARY = "A library to provide automatic paging for console output"
HOMEPAGE = "https://github.com/zaneb/autopage"
AUTHOR = "Zane Bitter <zbitter@redhat.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/36/b1/e5a1c2ebeb64ccc9c2a4ae133f5955d9824482628ed4bf0331c73323f0de/autopage-0.5.1.tar.gz"
SRC_URI[md5sum] = "a131cc1e1a8f35a16c55e55e2cc497c3"
SRC_URI[sha256sum] = "01be3ee61bb714e9090fcc5c10f4cf546c396331c620c6ae50a2321b28ed3199"

S = "${WORKDIR}/autopage-0.5.1"

RDEPENDS_${PN} = ""

#inherit setuptools3
#inherit pypi python_poetry_core
#inherit pypi python_flit_core
inherit pypi python_setuptools_build_meta


