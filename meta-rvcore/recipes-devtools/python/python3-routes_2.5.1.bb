SUMMARY = "Routes is a Python re-implementation of the Rails routes system for mapping URL’s to Controllers/Actions and generating URL’s. \
Routes makes it easy to create pretty and concise URL’s that are RESTful with little effort."
LICENSE = "GPL-2.0-only & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=90976c1a0e3029278f882cfe2e84a6ae"

PYPI_SRC_URI = "https://files.pythonhosted.org/packages/62/01/1504b710f68840f4152d460a4ffbc6b8265485b636235ddd72a8dfe686ae/Routes-2.5.1.tar.gz"
SRC_URI[sha256sum] = "b6346459a15f0cbab01a45a90c3d25caf980d4733d628b4cc1952b865125d053"

inherit setuptools3 pypi

S = "${WORKDIR}/Routes-${PV}"
