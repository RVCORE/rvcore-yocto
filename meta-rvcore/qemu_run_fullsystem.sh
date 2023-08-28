#!/bin/sh

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


#IOMMU_DEVICE="-device virtio-iommu-pci"
#IOMMU_DEVICE="-device virtio-iommu"
#IOMMU_DEVICE="-device vfio-pci"	#for transport transfer into guest
#DISK_DRIVER="-device virtio-blk-pci,drive=nvm,iommu_platform=true,disable-legacy=on"

#DISK_DRIVER="-device virtio-blk-device,drive=nvm,iommu_platform=true"


#make nvme dist for spdk
#qemu-img create -f qcow2 nvme.qcow 1G

DISK_DRIVER="-device nvme,drive=nvm,serial=testnvme"
SECOND_DISK="-drive file=/home/zhangze/nvme.qcow,if=none,id=nvm"

MACHINE=qemuriscv64 runqemu nographic qemuparams="-smp 20 -m 36000 $DISK_DRIVER $SECOND_DISK $IOMMU_DEVICE"


