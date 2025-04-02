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
repo init -u https://github.com/riscv/meta-riscv  -b 07658f1181e3ecd5f69b3e62c5319939426ffb02 -m tools/manifests/riscv-yocto.xml
repo sync -d -c

BRANCH_NAME=20250401

repo start ${BRANCH_NAME} --rev 07658f1181e3ecd5f69b3e62c5319939426ffb02 meta-riscv/
repo start ${BRANCH_NAME} --rev 8147a884c68d8fdd89939a8443a902b65297520c meta-openembedded/
repo start ${BRANCH_NAME} --rev e894acce6ede8bedafc1859ea0345ee6d80e9c74 poky


echo "download clang revival layer"
if [ -d meta-clang-revival ]
then
	cd meta-clang-revival
	git fetch --all
else
	git clone https://github.com/zboszor/meta-clang-revival
	cd meta-clang-revival
fi

git checkout -b ${BRANCH_NAME} d54230b2763af3e549490576606ff54702a267ce

cd ..

echo "download clang layer"
if [ -d meta-clang ]
then
	cd meta-clang
	git fetch --all
else
	git clone https://github.com/kraj/meta-clang
	cd meta-clang
fi

git checkout -b ${BRANCH_NAME} 93dec321980091b8abfa1f7d72c50b844c63167c

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

git checkout -b ${BRANCH_NAME} 4f5ff4c3c86c90d9a2da787740be6b8b8b4de821

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

git checkout -b ${BRANCH_NAME} a309b738e73860781ee9099de5fc9df7ee22950c

cd ..
