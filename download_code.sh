#!/bin/bash

git config --global http.postBuffer 524288000
git config --global http.sslVerify false

#download riscv repo
repo init -u https://github.com/riscv/meta-riscv  -b master -m tools/manifests/riscv-yocto.xml
repo sync
repo start work --all

#download clang layer
git clone https://github.com/kraj/meta-clang.git

#these layers for spec06
git clone git://git.yoctoproject.org/meta-cloud-services

git clone git://git.yoctoproject.org/meta-selinux

git clone git://git.yoctoproject.org/meta-security

git clone git://git.yoctoproject.org/meta-virtualization

git clone https://git.yoctoproject.org/meta-cgl

#download rvcore_yocto layer
