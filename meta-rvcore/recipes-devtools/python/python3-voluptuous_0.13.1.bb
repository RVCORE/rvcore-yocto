
SUMMARY = ""
HOMEPAGE = "https://github.com/alecthomas/voluptuous"
AUTHOR = "Alec Thomas <alec@swapoff.org>"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=2fa3bc081f1acb34f20d260fc6b97fca"

SRC_URI = "https://files.pythonhosted.org/packages/72/0c/0ed7352eeb7bd3d53d2c0ae87fa1e222170f53815b8df7d9cdce7ffedec0/voluptuous-0.13.1.tar.gz"
SRC_URI[md5sum] = "78d39d2a15e3717ab8d100944da60d11"
SRC_URI[sha256sum] = "e8d31c20601d6773cb14d4c0f42aee29c6821bbd1018039aac7ac5605b489723"

S = "${WORKDIR}/voluptuous-0.13.1"

RDEPENDS_${PN} = ""

inherit setuptools3
