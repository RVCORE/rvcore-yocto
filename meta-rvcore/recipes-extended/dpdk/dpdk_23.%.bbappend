FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:remove = " file://0001-config-meson-get-cpu_instruction_set-from-meson-opti.patch \
             file://0001-net-ionic-fix-build-with-Fedora.patch \
             file://0001-net-gve-base-fix-build-with-Fedora.patch "

SRC_URI += "file://0001-fix-build-for-riscv64.patch "

BRANCH = "24.11"
PV = "24.11.0"

SRCREV = "39594cdfcb730ea667370b1e304313d10996aff3"
EXTRA_OEMESON = " -Dexamples=all -Dcpu_instruction_set=generic "

DEPENDS += "openssl libpcap jansson libbsd libarchive"

COMPATIBLE_MACHINE = "^(qemuriscv64)$"
