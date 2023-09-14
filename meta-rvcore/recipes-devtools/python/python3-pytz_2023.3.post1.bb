
SUMMARY = "World timezone definitions, modern and historical"
HOMEPAGE = "http://pythonhosted.org/pytz"
AUTHOR = "Stuart Bishop <stuart@stuartbishop.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1a67fc46c1b596cce5d21209bbe75999"

SRC_URI = "https://files.pythonhosted.org/packages/69/4f/7bf883f12ad496ecc9514cd9e267b29a68b3e9629661a2bbc24f80eff168/pytz-2023.3.post1.tar.gz"
SRC_URI[md5sum] = "84e6569fcc917b096cca1063819c4ab0"
SRC_URI[sha256sum] = "7b4fddbeb94a1eba4b557da24f19fdf9db575192544270a9101d8509f9f43d7b"

S = "${WORKDIR}/pytz-2023.3.post1"

RDEPENDS_${PN} = ""

inherit setuptools3
BBCLASSEXTEND = "native nativesdk"
