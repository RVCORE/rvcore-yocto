FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

include linux-yocto_virtualization.inc



SRC_URI += " \
    ${@bb.utils.contains('MACHINE', 'qemuriscv64', 'file://qemusmp.cfg', '', d)} \
    ${@bb.utils.contains('MACHINE', 'yinxing-fpga', 'file://defconfig', '', d)} \
"

COMPATIBLE_MACHINE = "^(yinxing-fpga|qemuriscv64)$"

KCONFIG_MODE:yinxing-fpga = "allnoconfig"
KCONFIG_MODE:qemuriscv64 = "alldefconfig"

KBRANCH:yinxing-fpga ?= "v5.19/standard/base"
SRCREV_machine:yinxing-fpga ?= "44a446e91acea4f2f0d35896763224c3b52a3ed5"

PV:yinxing-fpga = "5.19.9"
