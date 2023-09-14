
SUMMARY = "Oslo Policy library"
HOMEPAGE = "https://docs.openstack.org/oslo.policy/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/d4/e0/308059511e7d860141db5f3d54709c98daa5ba9ee3446f5bc3c4583623fe/oslo.policy-4.2.1.tar.gz"
SRC_URI[md5sum] = "1b7027b538c0abb6dacfbc24de3eea41"
SRC_URI[sha256sum] = "6be67d10bf1464ebc35b9dc63896a2401e335e35039d5775c0ec472845d13288"

S = "${WORKDIR}/oslo.policy-4.2.1"

RDEPENDS_${PN} = "python3-pyyaml python3-oslo-config python3-oslo-context python3-oslo-i18n python3-oslo-serialization python3-oslo-utils python3-requests python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
