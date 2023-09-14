
SUMMARY = "oslo.reports library"
HOMEPAGE = "https://docs.openstack.org/oslo.reports/latest"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/01/76/938baf155103fa6838d902d6b852ba339e7e2ac7b51306a3d4750f3c9902/oslo.reports-3.1.0.tar.gz"
SRC_URI[md5sum] = "3df3d68cf34f3ddbcc2b3f7499c0c984"
SRC_URI[sha256sum] = "c5157f5c30986a61ca51afc8c4285d5c12f0dc2197ab9883748fa87a136c7508"

S = "${WORKDIR}/oslo.reports-3.1.0"

RDEPENDS_${PN} = "python3-jinja2 python3-oslo-i18n python3-oslo-serialization python3-oslo-utils python3-pbr python3-psutil"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
