
SUMMARY = "Retry code until it succeeds"
HOMEPAGE = "https://github.com/jd/tenacity"
AUTHOR = "Julien Danjou <julien@danjou.info>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

SRC_URI = "https://files.pythonhosted.org/packages/89/3c/253e1627262373784bf9355db9d6f20d2d8831d79f91e9cca48050cddcc2/tenacity-8.2.3.tar.gz"
SRC_URI[md5sum] = "9e1b9dc3e3240a56c1f6e9bab46037c9"
SRC_URI[sha256sum] = "5398ef0d78e63f40007c1fb4c0bff96e1911394d2fa8d194f77619c05ff6cc8a"

S = "${WORKDIR}/tenacity-8.2.3"

RDEPENDS_${PN} = ""
DEPENDS = "python3-pip-native python3-pbr-native python3-setuptools-scm-native"

inherit setuptools3
