
DESCRIPTION = "Oslo Log Library"
HOMEPAGE = "https://launchpad.net/oslo"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"


PYPI_SRC_URI = "https://files.pythonhosted.org/packages/d8/72/d33c098abdee0d0d4eca8fc88e6352bdb8990b4be840350a0d589164b901/oslo.log-5.3.0.tar.gz"
SRC_URI[sha256sum] = "cc94aabdb50e1e2571c6cbc4b399694a0541576735908a984a0223a9e1fbdb3e"

inherit pypi setuptools3
S = "${WORKDIR}/oslo.log-5.3.0"

DEPENDS += " \
        python3-pip \
        python3-babel \
        python3-pbr-native \
        "

# Satisfy setup.py 'setup_requires'
DEPENDS += " \
        python3-pbr-native \
        "

# RDEPENDS_default: 
RDEPENDS_${PN} += " \
        bash \
        python3-pbr \
        python3-six \
        python3-oslo.config \
        python3-oslo.context \
        python3-oslo.i18n \
        python3-oslo.utils \
        python3-oslo.serialization \
        python3-pyinotify \
        python3-debtcollector \
        python3-dateutil \
        python3-monotonic \
        "
