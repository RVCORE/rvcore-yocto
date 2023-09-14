
SUMMARY = "Testscenarios, a pyunit extension for dependency injection"
HOMEPAGE = "https://launchpad.net/testscenarios"
AUTHOR = "Testing-cabal <testing-cabal@lists.launchpad.net>"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://COPYING;md5=70aaa9556bb750f9f517b5ad33b42fe4"

SRC_URI = "https://files.pythonhosted.org/packages/f0/de/b0b5b98c0f38fd7086d082c47fcb455eedd39a044abe7c595f5f40cd6eed/testscenarios-0.5.0.tar.gz"
SRC_URI[md5sum] = "859073d9e7b049aee2e6704c51f6001a"
SRC_URI[sha256sum] = "c257cb6b90ea7e6f8fef3158121d430543412c9a87df30b5dde6ec8b9b57a2b6"

S = "${WORKDIR}/testscenarios-0.5.0"

RDEPENDS_${PN} = "python3-pbr python3-testtools"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
