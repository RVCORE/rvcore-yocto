
SUMMARY = "Database schema migration for SQLAlchemy"
HOMEPAGE = "http://www.openstack.org/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=69cb81512cb1325060e43fd55839b535"

SRC_URI = "https://files.pythonhosted.org/packages/36/bb/40f66b12b18fb03da76dcee31df75cca9e54b71d9d8a784bb95bfbadee2c/sqlalchemy-migrate-0.13.0.tar.gz \
           file://0001-Expected-end-or-semicolon-after-version-specifier.patch \
"

SRC_URI[md5sum] = "86572c92ae84334907f5e3a2cecc92a6"
SRC_URI[sha256sum] = "0bc02e292a040ade5e35a01d3ea744119e1309cdddb704fdb99bac13236614f8"

S = "${WORKDIR}/sqlalchemy-migrate-0.13.0"

RDEPENDS_${PN} = "python3-pbr python3-sqlalchemy python3-decorator python3-six python3-sqlparse python3-tempita"
DEPENDS = "python3-pip-native python3-pbr-native python3-pytz-native"

#inherit pypi python_setuptools_build_meta
#inherit pypi python_poetry_core
inherit setuptools3
