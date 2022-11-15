FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

COMPATIBLE_HOST:riscv64 = '(riscv64.*)-(linux.*|freebsd.*)'
COMPATIBLE_HOST:riscv32 = '(riscv32.*)-(linux.*|freebsd.*)'
