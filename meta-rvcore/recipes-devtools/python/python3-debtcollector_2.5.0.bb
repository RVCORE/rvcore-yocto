
SUMMARY = "A collection of Python deprecation patterns and strategies that help you collect your technical debt in a non-destructive manner."
HOMEPAGE = "https://docs.openstack.org/debtcollector/latest"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "https://files.pythonhosted.org/packages/c8/7d/904f64535d04f754c20a02a296de0bf3fb02be8ff5274155e41c89ae211a/debtcollector-2.5.0.tar.gz"
SRC_URI[md5sum] = "7fe3fa94e43731a483fbf436633023ec"
SRC_URI[sha256sum] = "dc9d1ad3f745c43f4bbedbca30f9ffe8905a8c028c9926e61077847d5ea257ab"

S = "${WORKDIR}/debtcollector-2.5.0"

RDEPENDS_${PN} = "python3-wrapt"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
