SUMMARY = "This is a fork of amqplib which was originally written by Barry Pederson. It is maintained by the Celery project, \
and used by kombu as a pure python alternative when librabbitmq is not available."



LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9d6ba772ac59c08a25a12ce15bd5f27b"


PYPI_SRC_URI = "https://files.pythonhosted.org/packages/cb/e7/bcaab89065e17915a28247fa5d4f582ca107b4544e2b1aba92d32f794a0f/amqp-5.1.1.tar.gz"
SRC_URI[sha256sum] = "2c1b13fecc0893e946c65cbd5f36427861cffa4ea2201d8f6fca22e2a373b5e2"

inherit pypi setuptools3
