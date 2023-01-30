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

BRANCH_NAME=20230130

repo start ${BRANCH_NAME} --rev d6e3efd54a3c1361fecf2a56c6f4f590fbe676d9 meta-riscv/
repo start ${BRANCH_NAME} --rev dd137feabdad2e7a2b3d107c703aad577a2e79c7 openembedded-core/
repo start ${BRANCH_NAME} --rev b986eac18b6a8bf633f5ef15f32f68de4c86173b openembedded-core/bitbake/
repo start ${BRANCH_NAME} --rev ca7082caa800124b4e0a7b36175f60387d1e3f8c meta-openembedded/

#download clang layer
if [ -d meta-clang ]
then
	cd meta-clang
	git fetch --all
else
	git clone https://github.com/kraj/meta-clang.git
	cd meta-clang
fi

git checkout -b ${BRANCH_NAME} 36d2b65f81542ea5e36664cfdc4d1b5763b9ba4b
