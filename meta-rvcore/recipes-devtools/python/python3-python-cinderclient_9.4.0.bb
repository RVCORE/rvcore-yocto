
SUMMARY = "OpenStack Block Storage API Client Library"
HOMEPAGE = "https://docs.openstack.org/python-cinderclient/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3572962e13e5e739b30b0864365e0795"

SRC_URI = "https://files.pythonhosted.org/packages/92/b7/ed31992f6a680eda4096379d16d7ce49cb9d7647a299f22882dc35472b4f/python-cinderclient-9.4.0.tar.gz"
SRC_URI[md5sum] = "8fe68a3695dd124f77ad6cf61ccff600"
SRC_URI[sha256sum] = "a53e6470a516627b59d22505222a0c85794be1a7f2774e87796105bd47ee9695"

S = "${WORKDIR}/python-cinderclient-9.4.0"

RDEPENDS_${PN} = "python3-prettytable python3-keystoneauth1 python3-oslo-i18n python3-oslo-utils python3-pbr python3-requests python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
