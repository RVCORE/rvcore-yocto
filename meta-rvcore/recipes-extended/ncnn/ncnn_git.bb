# Copyright (C) 2025 Zhang Ze <zhangze@rvcore.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "ncnn is a high-performance neural network inference framework optimized for the mobile platform"
HOMEPAGE = "https://github.com/Tencent/ncnn"
LICENSE = "BSD-3-Clause"
SECTION = "devel"
DEPENDS = "protobuf opencv"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8c8b5b19ef89ee9cfa47e768aa904935"


SRC_URI = "git://github.com/Tencent/ncnn;protocol=https;branch=master \
            file://0001-fix-ncnn-build-for-riscv64-yocto.patch"
SRCREV = "55e5c0ba0550274720a334e519ccf23b2d8a60c3"

inherit cmake

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"



EXTRA_OECMAKE += "-DCMAKE_BUILD_TYPE=relwithdebinfo \
                  -DNCNN_OPENMP=OFF \
                  -DNCNN_THREADS=OFF \
                  -DNCNN_RUNTIME_CPU=OFF \
                  -DNCNN_RVV=OFF \
                  -DNCNN_SIMPLEOCV=ON \
                  -DNCNN_BUILD_EXAMPLES=ON \
                 "

CFLAGS += "-march=rv64gc"
CXXFLAGS += "-march=rv64gc -fopenmp"

do_install:append() {
    mkdir -p ${D}${datadir}/${BPN}
    cp -r ${S}/benchmark ${D}${datadir}/${BPN}
    cp ${B}/benchmark/benchncnn ${D}${datadir}/${BPN}/benchmark
    cp -r ${B}/examples ${D}${datadir}/${BPN}
    rm -rf ${D}${datadir}/${BPN}/examples/CMakeFiles
    rm -rf ${D}${datadir}/${BPN}/examples/cmake_install.cmake
}

PACKAGES =+ "${PN}-examples"

FILES:${PN}-examples = " \
    ${datadir}/${BPN}/examples/* \
"
