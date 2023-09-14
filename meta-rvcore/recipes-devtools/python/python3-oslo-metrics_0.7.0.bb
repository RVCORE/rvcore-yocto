
SUMMARY = "Oslo Metrics API"
HOMEPAGE = "https://opendev.org/openstack/oslo.metrics"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/38/9d/38afd1d5ddb42a30217411776b5ab6ea0984049d185b5d4b325dba516898/oslo.metrics-0.7.0.tar.gz"
SRC_URI[md5sum] = "77812e933e80a5d091dc8bca372d501d"
SRC_URI[sha256sum] = "8c65269a30ba3e955277995742421e14f3887945b0ec521518034e5273f5949a"

S = "${WORKDIR}/oslo.metrics-0.7.0"

RDEPENDS_${PN} = "python3-oslo-config python3-oslo-log python3-oslo-utils python3-pbr python3-prometheus-client"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
