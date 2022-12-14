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

MACHINE="yinxing-fpga"
RVCORELAYER=`dirname $0`
BUILDDIR="$RVCORELAYER/../build/"
TMPDIR="$BUILDDIR/tmp-glibc/"

qemu_exe="${TMPDIR}/work/x86_64-linux/qemu-helper-native/1.0-r1/recipe-sysroot-native/usr/bin/qemu-system-riscv64"

bios_file="${TMPDIR}/deploy/images/${MACHINE}/fw_jump.elf"

kernel_file="${TMPDIR}/deploy/images/${MACHINE}/Image-initramfs-${MACHINE}.bin"

if [ ! -x $qemu_exe ]
then
	echo "qemu not exist!"
	exit 1

elif [ ! -e $kernel_file ]
then
	echo "kernel file not exist!"
	exit 1
fi

#console=ttyS0 
boot_params='mem=256M console=hvc0 earlycon=sbi loglevel=15'
#boot_params='console=ttyS0 earlycon=sbi '

$qemu_exe -machine virt -smp 4 -m 256 -serial mon:stdio -serial null -nographic -kernel $kernel_file -append "$boot_params"

#-bios $bios_file 


#get fpga ELF format kernel vmlinux
#${TMPDIR}/deploy/images/${MACHINE}/vmlinux-initramfs-${MACHINE}.bin
