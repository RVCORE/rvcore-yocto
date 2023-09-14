
SUMMARY = "Setuptools extension for CalVer package versions"
HOMEPAGE = "https://github.com/di/calver"
AUTHOR = "Dustin Ingram <di@python.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://files.pythonhosted.org/packages/b5/00/96cbed7c019c49ee04b8a08357a981983db7698ae6de402e57097cefc9ad/calver-2022.6.26.tar.gz"
SRC_URI[md5sum] = "e1fd924b9bf953c0b28c49bdfe117d7a"
SRC_URI[sha256sum] = "e05493a3b17517ef1748fbe610da11f10485faa7c416b9d33fd4a52d74894f8b"

S = "${WORKDIR}/calver-2022.6.26"

RDEPENDS_${PN} = ""

inherit setuptools3

BBCLASSEXTEND = "native nativesdk"
