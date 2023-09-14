
SUMMARY = "pyparsing module - Classes and methods to define and execute parsing grammars"
HOMEPAGE = ""
AUTHOR = " <Paul McGuire <ptmcg.gm+pyparsing@gmail.com>>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=657a566233888513e1f07ba13e2f47f1"

SRC_URI = "https://files.pythonhosted.org/packages/37/fe/65c989f70bd630b589adfbbcd6ed238af22319e90f059946c26b4835e44b/pyparsing-3.1.1.tar.gz"
SRC_URI[md5sum] = "bb8c8c6b8015ca5887ae2c37917ee82e"
SRC_URI[sha256sum] = "ede28a1a32462f5a9705e07aea48001a08f7cf81a021585011deba701581a0db"

S = "${WORKDIR}/pyparsing-3.1.1"

RDEPENDS_${PN} = ""

inherit pypi python_setuptools_build_meta
