
SUMMARY = "Promises, promises, promises."
HOMEPAGE = "http://github.com/celery/vine"
AUTHOR = "Ask Solem <ask@celeryproject.org>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=2d8960d4592a3b2359af2ef082dcfe16"

SRC_URI = "https://files.pythonhosted.org/packages/66/b2/8954108816865edf2b1e0d24f3c2c11dfd7232f795bcf1e4164fb8ee5e15/vine-5.0.0.tar.gz"
SRC_URI[md5sum] = "2fc3270a999cdc9341ba173360d62367"
SRC_URI[sha256sum] = "7d3b1624a953da82ef63462013bbd271d3eb75751489f9807598e8f340bd637e"

S = "${WORKDIR}/vine-5.0.0"

RDEPENDS_${PN} = ""

inherit setuptools3
