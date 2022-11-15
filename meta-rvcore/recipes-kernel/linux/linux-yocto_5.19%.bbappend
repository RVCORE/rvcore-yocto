FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:yinxing-fpga += "file://defconfig"

COMPATIBLE_MACHINE:yinxing-fpga = "^(yinxing-fpga)$"

KCONFIG_MODE:yinxing-fpga = "allnoconfig"

KBRANCH:yinxing-fpga ?= "v5.19/standard/base"
SRCREV_machine:yinxing-fpga ?= "44a446e91acea4f2f0d35896763224c3b52a3ed5"

PV:yinxing-fpga = "5.19.9"
