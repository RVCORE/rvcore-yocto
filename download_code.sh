#!/bin/bash

#***************************************************************************************
# Copyright (c) 2022 Beijing Vcore Technology Co.,Ltd.
#
# rvcore-yocto is licensed under Mulan PSL v2.
# You can use this software according to the terms and conditions of the Mulan PSL v2.
# You may obtain a copy of Mulan PSL v2 at:
#          http://license.coscl.org.cn/MulanPSL2
#
# THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
# EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
# MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
#
# See the Mulan PSL v2 for more details.
#*************************************************************************************

git config --global http.postBuffer 524288000
git config --global http.sslVerify false

#download riscv repo
repo init -u https://github.com/riscv/meta-riscv  -b 8b31dc0415190fae52228348d71dbf09abe21420 -m tools/manifests/riscv-yocto.xml
repo sync -d -c

BRANCH_NAME=20250715

repo start ${BRANCH_NAME} --rev 8b31dc0415190fae52228348d71dbf09abe21420 meta-riscv/
repo start ${BRANCH_NAME} --rev ad761f7808c00d234bd13171ae5c53ddd966bf28 meta-openembedded/
repo start ${BRANCH_NAME} --rev f3da837ad2c1e3a5bab6528da0505bd356e578b5 poky


#echo "download clang revival layer"
#if [ -d meta-clang-revival ]
#then
#	cd meta-clang-revival
#	git fetch --all
#else
#	git clone https://github.com/zboszor/meta-clang-revival
#	cd meta-clang-revival
#fi
#
#git checkout -b ${BRANCH_NAME} d54230b2763af3e549490576606ff54702a267ce
#
#cd ..

echo "download clang layer"
if [ -d meta-clang ]
then
	cd meta-clang
	git fetch --all
else
	git clone https://github.com/kraj/meta-clang
	cd meta-clang
fi

git checkout -b ${BRANCH_NAME} 18839aa63fabadc2d1fab977110694d2d1508834

cd ..

echo "download dpdk layer"
if [ -d meta-dpdk ]
then
	cd meta-dpdk
	git fetch --all
else
	git clone https://git.yoctoproject.org/meta-dpdk
	cd meta-dpdk
fi

git checkout -b ${BRANCH_NAME} c1f4b9a32fc0f87b0f732bcd908dd0f67f5ad9b1

cd ..

echo "download meta-virtualization layer"
if [ -d meta-virtualization ]
then
	cd meta-virtualization
	git fetch --all
else
	git clone https://git.yoctoproject.org/meta-virtualization
	cd meta-virtualization
fi

git checkout -b ${BRANCH_NAME} 640bca7e046689b789dd068059a7b18749d10c0c

cd ..
