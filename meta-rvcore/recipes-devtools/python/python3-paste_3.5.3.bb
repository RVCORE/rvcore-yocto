SUMMARY = "Paste is in maintenance mode and recently moved from bitbucket to github. Patches are accepted to keep it on life support, \
but for the most part, please consider using other options."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


PYPI_SRC_URI = "https://files.pythonhosted.org/packages/42/8f/b8b76caf28d49b22b52b3ce3907966fff911551c54f20ae9cf263804d607/Paste-3.5.3.tar.gz"
SRC_URI[sha256sum] = "fa093f46a4d1ea3898a849c8ce1d2a425c2bed5fc06b36384fe3ffaa652c081b"

inherit setuptools3 pypi

S = "${WORKDIR}/Paste-${PV}"
