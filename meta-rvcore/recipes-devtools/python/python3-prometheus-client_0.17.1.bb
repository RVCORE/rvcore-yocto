
SUMMARY = "Python client for the Prometheus monitoring system."
HOMEPAGE = "https://github.com/prometheus/client_python"
AUTHOR = "Brian Brazil <brian.brazil@robustperception.io>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://files.pythonhosted.org/packages/f5/05/aee33352594522c56eb4a4382b5acd9a706a030db9ba2fc3dc38a283e75c/prometheus_client-0.17.1.tar.gz"
SRC_URI[md5sum] = "d229898bc8252fb11d49969842d9b821"
SRC_URI[sha256sum] = "21e674f39831ae3f8acde238afd9a27a37d0d2fb5a28ea094f0ce25d2cbf2091"

S = "${WORKDIR}/prometheus_client-0.17.1"

RDEPENDS_${PN} = ""

inherit setuptools3
