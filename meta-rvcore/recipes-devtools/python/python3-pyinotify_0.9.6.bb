
SUMMARY = "Linux filesystem events monitoring"
HOMEPAGE = "http://github.com/seb-m/pyinotify"
AUTHOR = "Sebastien Martini <seb@dbzteam.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=ab173cade7965b411528464589a08382"

SRC_URI = "https://files.pythonhosted.org/packages/e3/c0/fd5b18dde17c1249658521f69598f3252f11d9d7a980c5be8619970646e1/pyinotify-0.9.6.tar.gz"
SRC_URI[md5sum] = "8e580fa1ff3971f94a6f81672b76c406"
SRC_URI[sha256sum] = "9c998a5d7606ca835065cdabc013ae6c66eb9ea76a00a1e3bc6e0cfe2b4f71f4"

S = "${WORKDIR}/pyinotify-0.9.6"

RDEPENDS_${PN} = ""

inherit setuptools3
