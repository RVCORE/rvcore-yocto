
SUMMARY = "A simple statsd client."
HOMEPAGE = ""
AUTHOR = " <James Socol <me@jamessocol.com>>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4d8aa8ac1dc54b8aee4054bd5e5c61bd"

SRC_URI = "https://files.pythonhosted.org/packages/27/29/05e9f50946f4cf2ed182726c60d9c0ae523bb3f180588c574dd9746de557/statsd-4.0.1.tar.gz"
SRC_URI[md5sum] = "33f9f58c5687cd87977e8b27f5d60e42"
SRC_URI[sha256sum] = "99763da81bfea8daf6b3d22d11aaccb01a8d0f52ea521daab37e758a4ca7d128"

S = "${WORKDIR}/statsd-4.0.1"

RDEPENDS_${PN} = ""

inherit pypi python_setuptools_build_meta
