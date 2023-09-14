
SUMMARY = "Cloud computing fabric controller"
HOMEPAGE = "https://docs.openstack.org/nova/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/d4/bf/572039ebce20595e29c060d7c6b7eb00ce3c01b84ac453d8014ff7fa0755/nova-27.1.0.tar.gz"
SRC_URI[md5sum] = "78fc13e640c0b451ea1f86ecbe19018b"
SRC_URI[sha256sum] = "ef1063d7507c7821a70f9c7a07151fac41b5be424e94bca17bb690cfa50b08a7"

S = "${WORKDIR}/nova-27.1.0"

RDEPENDS_${PN} = "python3-jinja2 python3-paste python3-pastedeploy python3-prettytable python3-pyyaml python3-routes python3-sqlalchemy python3-webob python3-alembic python3-castellan python3-cryptography python3-cursive python3-decorator python3-eventlet python3-futurist python3-greenlet python3-iso8601 python3-jsonschema python3-keystoneauth1 python3-keystonemiddleware python3-lxml python3-microversion-parse python3-netaddr python3-netifaces python3-openstacksdk python3-os-brick python3-os-resource-classes python3-os-service-types python3-os-traits python3-os-vif python3-oslo-cache python3-oslo-concurrency python3-oslo-config python3-oslo-context python3-oslo-db python3-oslo-i18n python3-oslo-limit python3-oslo-log python3-oslo-messaging python3-oslo-middleware python3-oslo-policy python3-oslo-privsep python3-oslo-reports python3-oslo-rootwrap python3-oslo-serialization python3-oslo-service python3-oslo-upgradecheck python3-oslo-utils python3-oslo-versionedobjects python3-packaging python3-paramiko python3-pbr python3-psutil python3-python-cinderclient python3-python-dateutil python3-python-glanceclient python3-python-neutronclient python3-requests python3-retrying python3-rfc3986 python3-sqlalchemy-migrate python3-stevedore python3-tooz python3-websockify"
DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3


FILES:${PN} += "/usr/etc/nova/*"
