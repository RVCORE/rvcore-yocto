
SUMMARY = "A tiny LRU cache implementation and decorator"
HOMEPAGE = "http://www.repoze.org"
AUTHOR = "Agendaless Consulting <repoze-dev@lists.repoze.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2c33cdbc6bc9ae6e5d64152fdb754292"

SRC_URI = "https://files.pythonhosted.org/packages/12/bc/595a77c4b5e204847fdf19268314ef59c85193a9dc9f83630fc459c0fee5/repoze.lru-0.7.tar.gz"
SRC_URI[md5sum] = "c08cc030387e0b1fc53c5c7d964b35e2"
SRC_URI[sha256sum] = "0429a75e19380e4ed50c0694e26ac8819b4ea7851ee1fc7583c8572db80aff77"

S = "${WORKDIR}/repoze.lru-0.7"

RDEPENDS_${PN} = ""

inherit setuptools3
