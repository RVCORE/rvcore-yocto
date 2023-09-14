
SUMMARY = "cmd2 - quickly build feature-rich and user-friendly interactive command line applications in Python"
HOMEPAGE = "https://github.com/python-cmd2/cmd2"
AUTHOR = "Catherine Devlin <catherine.devlin@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fad7740aa21780c8b9a214f5b320b4ad"

SRC_URI = "https://files.pythonhosted.org/packages/13/04/b85213575a7bf31cbf1d699cc7d5500d8ca8e52cbd1f3569a753a5376d5c/cmd2-2.4.3.tar.gz"
SRC_URI[md5sum] = "b2c8691ef6300c2c72c697b846c6be1e"
SRC_URI[sha256sum] = "71873c11f72bd19e2b1db578214716f0d4f7c8fa250093c601265a9a717dee52"

S = "${WORKDIR}/cmd2-2.4.3"

RDEPENDS_${PN} = "python3-attrs python3-pyperclip python3-wcwidth"
DEPENDS = "python3-pip-native python3-pbr-native python3-setuptools-scm-native"

inherit setuptools3
