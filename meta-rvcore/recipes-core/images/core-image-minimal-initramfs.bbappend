# Use the same restriction as initramfs-module-install
COMPATIBLE_HOST:riscv64 = '(riscv64.*)-(linux.*|freebsd.*)'
COMPATIBLE_HOST:riscv32 = '(riscv32.*)-(linux.*|freebsd.*)'

BAD_RECOMMENDATIONS += "initramfs-module-rootfs"

INITRAMFS_SCRIPTS = "\ 
                    initramfs-boot \
                    "
IMAGE_FEATURES += "empty-root-password"
