
SUMMARY = "Python client for Redis database and key-value store"
HOMEPAGE = "https://github.com/redis/redis-py"
AUTHOR = "Redis Inc. <oss@redis.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=609ded3add9111c4c6e102f1d421d3f8"

SRC_URI = "https://files.pythonhosted.org/packages/1d/b9/b6eeedcbcf487b000f96aa085c842a46d24eab99a5bb05ba6fd917e0ea14/redis-5.0.0.tar.gz"
SRC_URI[md5sum] = "ee71016b81935b0c6a816ea2efc11963"
SRC_URI[sha256sum] = "5cea6c0d335c9a7332a460ed8729ceabb4d0c489c7285b0a86dbbf8a017bd120"

S = "${WORKDIR}/redis-5.0.0"

RDEPENDS_${PN} = ""

inherit setuptools3
