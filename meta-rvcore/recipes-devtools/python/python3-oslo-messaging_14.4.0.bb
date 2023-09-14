
SUMMARY = "Oslo Messaging API"
HOMEPAGE = "https://docs.openstack.org/oslo.messaging/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c46f31914956e4579f9b488e71415ac8"

SRC_URI = "https://files.pythonhosted.org/packages/46/44/f9c44d32523830caecc8577b8a4bee5ae610ed9a02a4b2ecd4b3320bf600/oslo.messaging-14.4.0.tar.gz"
SRC_URI[md5sum] = "9a42d4c10cf651feba9ca6a840cba3f5"
SRC_URI[sha256sum] = "490efe6de381dec2eeaaefc053adb8dd7a29420d31adcdb26a8d0481b727fb35"

S = "${WORKDIR}/oslo.messaging-14.4.0"

RDEPENDS_${PN} = "python3-pyyaml python3-webob python3-amqp python3-cachetools python3-debtcollector python3-futurist python3-kombu python3-oslo-config python3-oslo-log python3-oslo-metrics python3-oslo-middleware python3-oslo-serialization python3-oslo-service python3-oslo-utils python3-pbr python3-stevedore"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3
