
SUMMARY = "Editable installations"
HOMEPAGE = ""
AUTHOR = " <Paul Moore <p.f.moore@gmail.com>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=41bc1be47b7bb8240db3ef928c7cb0bf"

SRC_URI = "https://files.pythonhosted.org/packages/37/4a/986d35164e2033ddfb44515168a281a7986e260d344cf369c3f52d4c3275/editables-0.5.tar.gz"
SRC_URI[md5sum] = "520de8c3a9dc5dfb2b365d104541c9de"
SRC_URI[sha256sum] = "309627d9b5c4adc0e668d8c6fa7bac1ba7c8c5d415c2d27f60f081f8e80d1de2"

S = "${WORKDIR}/editables-0.5"

RDEPENDS_${PN} = ""

inherit pypi python_setuptools_build_meta

BBCLASSEXTEND = "native nativesdk"
