
SUMMARY = "plugin and hook calling mechanisms for python"
HOMEPAGE = "https://github.com/pytest-dev/pluggy"
AUTHOR = "Holger Krekel <holger@merlinux.eu>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c8206d16fd5cc02fa9b0bb98955e5c2"

SRC_URI = "https://files.pythonhosted.org/packages/36/51/04defc761583568cae5fd533abda3d40164cbdcf22dee5b7126ffef68a40/pluggy-1.3.0.tar.gz"
SRC_URI[md5sum] = "f31aad77be2f5af8ed3864159b7fd743"
SRC_URI[sha256sum] = "cf61ae8f126ac6f7c451172cf30e3e43d3ca77615509771b3a984a0730651e12"

S = "${WORKDIR}/pluggy-1.3.0"

RDEPENDS_${PN} = ""
DEPENDS = "python3-pip-native python3-pbr-native python3-setuptools-scm-native"

inherit setuptools3

BBCLASSEXTEND = "native nativesdk"
