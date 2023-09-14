
SUMMARY = "OpenStack DNS-as-a-Service - Client"
HOMEPAGE = "https://docs.openstack.org/python-designateclient/latest"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/77/39/256c2c4a54c5d9efe64a9c711f49d7756a4b59c802649ead4787ab24a599/python-designateclient-5.3.0.tar.gz"
SRC_URI[md5sum] = "d4dcc8fdd6e80b932224a522a930126d"
SRC_URI[sha256sum] = "ee7ae841eabff1cc389dc4582387366ed574a353c46b16a96fb411253d469844"

S = "${WORKDIR}/python-designateclient-5.3.0"

RDEPENDS_${PN} = "python3-cliff python3-debtcollector python3-jsonschema python3-keystoneauth1 python3-osc-lib python3-oslo-serialization python3-oslo-utils python3-pbr python3-requests python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"


inherit setuptools3
