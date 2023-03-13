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
repo init -u https://github.com/riscv/meta-riscv  -b master -m tools/manifests/riscv-yocto.xml
repo sync -d -c

BRANCH_NAME=20230309

repo start ${BRANCH_NAME} --rev 880aa9b7e39502d196dcaf296cbf0efe0d585f50 meta-riscv/
repo start ${BRANCH_NAME} --rev 3cf894b8a9c4fa14fcc7c7445e85e9ae3192b398 openembedded-core/
repo start ${BRANCH_NAME} --rev e859ce61a7422425960342a47785468cef49caa1 openembedded-core/bitbake/
repo start ${BRANCH_NAME} --rev eb0d072f9ecfa175c79b781fc62265914abeb94e meta-openembedded/

#download clang layer
if [ -d meta-clang ]
then
	cd meta-clang
	git fetch --all
else
	git clone https://github.com/kraj/meta-clang.git
	cd meta-clang
fi

git checkout -b ${BRANCH_NAME} 87d41f7dd7a69bbf15973506faf113a83bd60511
