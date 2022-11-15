FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

#SRC_URI = "file://init.sh"

do_install() {
#       install -m 0755 ${WORKDIR}/init.sh ${D}/init

        install -d ${D}/dev
        install -d ${D}/proc
        install -d ${D}/sys
        install -d ${D}/home/root

        # Create device nodes expected by some kernels in initramfs
        # before even executing /init.
        mknod -m 622 ${D}/dev/console c 5 1
}

FILES:${PN} = "/dev/console \
                /proc \
                /sys \
                /home/root "
