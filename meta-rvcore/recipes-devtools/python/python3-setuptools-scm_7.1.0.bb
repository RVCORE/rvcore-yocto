
SUMMARY = "the blessed package to manage your versions by scm tags"
HOMEPAGE = "https://github.com/pypa/setuptools_scm/"
AUTHOR = "Ronny Pfannschmidt <opensource@ronnypfannschmidt.de>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

SRC_URI = "https://files.pythonhosted.org/packages/98/12/2c1e579bb968759fc512391473340d0661b1a8c96a59fb7c65b02eec1321/setuptools_scm-7.1.0.tar.gz"
SRC_URI[md5sum] = "158dc741637fb4fa4b955c62bd2c08be"
SRC_URI[sha256sum] = "6c508345a771aad7d56ebff0e70628bf2b0ec7573762be9960214730de278f27"

S = "${WORKDIR}/setuptools_scm-7.1.0"

RDEPENDS_${PN} = "python3-packaging python3-setuptools python3-typing-extensions"

inherit setuptools3
