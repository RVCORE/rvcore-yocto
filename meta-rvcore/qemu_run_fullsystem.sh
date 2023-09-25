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
#IOMMU_DEVICE="-device virtio-iommu-device"

#IOMMU_DEVICE="-device vfio-pci"	#for transport transfer into guest
#DISK_DRIVER="-device virtio-blk-pci,drive=nvm,iommu_platform=true,disable-legacy=on"

#DISK_DRIVER="-device virtio-blk-device,drive=nvm,iommu_platform=true"


#1.make harddisk for spdk
#qemu-img create -f qcow2 nvme.qcow 1G

#2.choose UIO or VFIO

#for SPDK to use NVME harddisk, which does not support IOMMU, so must use UIO
#SECOND_DISK_DRIVE="-drive id=nvm,file=/home/zhangze/nvme.qcow,if=none"
#SECOND_DISK_DEVICE="-device nvme,drive=nvm,serial=testnvme"

#for harddisk supporting IOMMU, so SPDK can use VFIO
#SECOND_DISK_DRIVE="-drive id=spdk_nvme,file=/home/zhangze/nvme.qcow,if=none"
#SECOND_DISK_DEVICE="-device virtio-blk-pci,drive=spdk_nvme,serial=testnvme,iommu_platform=true,disable-legacy=on"

MACHINE=qemuriscv64 runqemu nographic qemuparams="-smp 20 -m 36000 $SECOND_DISK_DRIVE $SECOND_DISK_DEVICE $IOMMU_DEVICE"
