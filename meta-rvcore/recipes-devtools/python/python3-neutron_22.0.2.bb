
SUMMARY = "OpenStack Networking"
HOMEPAGE = "https://docs.openstack.org/neutron/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

SRC_URI = "https://files.pythonhosted.org/packages/00/dc/6f3a5b44de5638db8ff006efdeda79d3e130e37d283eb9933588e8c86e49/neutron-22.0.2.tar.gz"
SRC_URI[md5sum] = "9eb6465c56826d200375de0005e18acf"
SRC_URI[sha256sum] = "253efc46f4c4e64043e38cceda6f53a0028d7e21f8a8675c99247fa63c832b0d"

S = "${WORKDIR}/neutron-22.0.2"

RDEPENDS:${PN} = "python3-jinja2 python3-paste python3-pastedeploy python3-routes python3-sqlalchemy python3-webob python3-alembic python3-debtcollector python3-decorator python3-eventlet python3-futurist python3-httplib2 python3-keystoneauth1 python3-keystonemiddleware python3-netaddr python3-netifaces python3-neutron-lib python3-openstacksdk python3-os-ken python3-os-resource-classes python3-os-vif python3-oslo-cache python3-oslo-concurrency python3-oslo-config python3-oslo-context python3-oslo-db python3-oslo-i18n python3-oslo-log python3-oslo-messaging python3-oslo-middleware python3-oslo-policy python3-oslo-privsep python3-oslo-reports python3-oslo-rootwrap python3-oslo-serialization python3-oslo-service python3-oslo-upgradecheck python3-oslo-utils python3-oslo-versionedobjects python3-osprofiler python3-ovs python3-ovsdbapp python3-packaging python3-pbr python3-pecan python3-psutil python3-pyopenssl python3-python-designateclient python3-python-neutronclient python3-python-novaclient python3-requests python3-stevedore python3-tenacity python3-tooz bash"
#RDEPENDS:python3-neutron = "bash"

DEPENDS = "python3-pip-native python3-pbr-native"

inherit setuptools3

FILES:${PN} += " \
    /usr/share \
    /usr/etc \
    /usr/share/ansible/* \
    /usr/etc/neutron/* \
"

