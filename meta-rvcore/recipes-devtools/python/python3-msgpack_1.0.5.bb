
SUMMARY = "MessagePack serializer"
HOMEPAGE = "https://msgpack.org/"
AUTHOR = "Inada Naoki <songofacandy@gmail.com>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=cd9523181d9d4fbf7ffca52eaa2a5751"

SRC_URI = "https://files.pythonhosted.org/packages/dc/a1/eba11a0d4b764bc62966a565b470f8c6f38242723ba3057e9b5098678c30/msgpack-1.0.5.tar.gz"
SRC_URI[md5sum] = "da12a9f0a65a803ec005219f6095d0a3"
SRC_URI[sha256sum] = "c075544284eadc5cddc70f4757331d99dcbc16b2bbd4849d15f8aae4cf36d31c"

S = "${WORKDIR}/msgpack-1.0.5"

RDEPENDS_${PN} = ""

inherit setuptools3
