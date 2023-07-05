FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

#SRC_URI += "file://0001-fix-linux-6.1.x-crash-caused-by-cpu_relax.patch"

include linux-yocto_virtualization.inc



SRC_URI += " \
    ${@bb.utils.contains('MACHINE', 'qemuriscv64', 'file://qemusmp.cfg', '', d)} \
    ${@bb.utils.contains('MACHINE', 'qemuriscv64', 'file://qemukvm.cfg', '', d)} \
    ${@bb.utils.contains('MACHINE', 'qemuriscv64', 'file://0001-fix-linux-6.1.x-crash-caused-by-cpu_relax.patch', '', d)} \
    ${@bb.utils.contains('MACHINE', 'yinxing-fpga', 'file://defconfig', '', d)} \
"

COMPATIBLE_MACHINE = "^(yinxing-fpga|qemuriscv64)$"

KCONFIG_MODE:yinxing-fpga = "allnoconfig"
KCONFIG_MODE:qemuriscv64 = "alldefconfig"

#for yinxing-fpga machine, ramdisk image
INITRAMFS_IMAGE:yinxing-fpga ?= "core-image-minimal-initramfs"
