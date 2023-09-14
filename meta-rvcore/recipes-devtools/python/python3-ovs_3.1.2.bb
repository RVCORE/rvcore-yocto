
SUMMARY = "Open vSwitch library"
HOMEPAGE = "http://www.openvswitch.org/"
AUTHOR = "Open vSwitch <dev@openvswitch.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://setup.py;md5=6b6bf0413395ef167708e3110247fe20"

SRC_URI = "https://files.pythonhosted.org/packages/52/a2/3a8e6c21e926560599018a4a3d721f17bf4c01705a9d75365952098ce3f6/ovs-3.1.2.tar.gz"
SRC_URI[md5sum] = "7135631e305ad8d2b28574de66c8f231"
SRC_URI[sha256sum] = "582340a803b220aa1a0ad150916f3060775198d498340b589e93f81000b007df"

S = "${WORKDIR}/ovs-3.1.2"

RDEPENDS_${PN} = ""

inherit setuptools3
