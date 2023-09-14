SUMMARY = "Build and publish crates with pyo3, rust-cpython and cffi bindings as well as rust binaries as python packages"
HOMEPAGE = "https://github.com/PyO3/maturin"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://license-apache;md5=1836efb2eb779966696f473ee8540542"

SRC_URI[sha256sum] = "ef3f42af453d64f233b99543c3001bee645019a9c2022c7972210a9cacb5301f"

DEPENDS = "python3-setuptools-rust-native"

#inherit pypi setuptools3
inherit pypi python_setuptools_build_meta
