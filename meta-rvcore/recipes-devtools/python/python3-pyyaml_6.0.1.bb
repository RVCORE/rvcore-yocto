
SUMMARY = "YAML parser and emitter for Python"
HOMEPAGE = "https://pyyaml.org/"
AUTHOR = "Kirill Simonov <xi@resolvent.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d8242660a8371add5fe547adf083079"

SRC_URI = "https://files.pythonhosted.org/packages/cd/e5/af35f7ea75cf72f2cd079c95ee16797de7cd71f29ea7c68ae5ce7be1eda0/PyYAML-6.0.1.tar.gz"
SRC_URI[md5sum] = "c9246277af2d9a13b7018af267a0831a"
SRC_URI[sha256sum] = "bfdf460b1736c775f2ba9f6a92bca30bc2095067b8a9d77876d1fad6cc3b4a43"

S = "${WORKDIR}/PyYAML-6.0.1"

RDEPENDS_${PN} = ""

inherit setuptools3
