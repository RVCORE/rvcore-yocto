FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
COMPATIBLE_MACHINE = "^(qemuriscv64)$"
COMPATIBLE_HOST:riscv64 = "(x86_64.*|arm.*|aarch64.*|riscv64.*)-linux"
