DESCRIPTION = "A console-only image with more full-featured Linux system \
functionality installed."

IMAGE_FEATURES += "splash ssh-server-openssh"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    packagegroup-core-buildessential \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image

FORTRAN_TOOLS = " \
    gfortran \
    gfortran-symlinks \
    libgfortran \
    libgfortran-dev \
"

CLOUD_TOOLS = " \
            containerd-opencontainers \
            runc-opencontainers \
            docker-moby \
            docker-compose \
            kubernetes \
            kubeadm kubectl kubelet kube-proxy kubernetes-misc kubernetes-host \
            kubernetes-cni \
            nerdctl \
"

#for static compile spec06
SPEC06_DEPENDENCE = " libstdc++-staticdev \
                      libatomic-staticdev \
                      libgomp-staticdev \
                      glibc-staticdev \
                      libgfortran-staticdev \
                      libhtml-tree-perl \
                      libhtml-tagset-perl  \
                      libhtml-parser-perl \
                      liburi-perl \
                      libwww-perl \
                      libwww-perl-dev \
                      libio-stringy-perl \
                      libhttp-message \
                      libhttp-date \
                      libclone \
                      libio-compress-perl \
                      libio-compress-lzma-perl \
                      libio-socket-ssl-perl \
                      libio-pty-perl \
                    "

#SPDK
SPDK_DEPENDS = " spdk \
                 spdk-examples \
                 spdk-scripts \
                 spdk-dev \
                 spdk-staticdev \
"

# for compile verilator
IMAGE_INSTALL:append = " openjdk \
                        openjdk-demo \
                        openjdk-doc \
                        openjdk-dev \
                        e2fsprogs \
                        e2fsprogs-resize2fs \
                        python3-pip \
                        gcc gcc-symlinks gcc-plugins \
                        gcc-dev \
                        gcc-doc \
                        gcov gcov-symlinks \
                        g++ g++-symlinks\
                        cpp cpp-symlinks \
                        binutils \
                        perl-misc \
                        go \
                        go-runtime-dev \
                        go-helloworld \
                        vim \
                        time \
                        perl \
                        perl-misc \
                        rust \
                        rust-llvm \
                        rust-hello-world \
                        ${FORTRAN_TOOLS} \
                        clang \
                        ccache \
                        bison \
                        git \
                        make \
                        cmake \
                        ninja \
                        ntpdate \
                        tzdata \
                        ldd \
                        gdb \
                        gdbserver \
                        ${SPEC06_DEPENDENCE} \
                        numactl \
                        graphviz \
                        lcov \
                        libsdl2 \
                        libsdl2-dev \
                        libsdl2-staticdev \
                        mill \
                        mill-jars \
                        verilator \
                        ${CLOUD_TOOLS} \
                        qemu \
                        acl \
                        redis \
                        tcl \
                        dpdk \
                        ${SPDK_DEPENDS} \
"

IMAGE_ROOTFS_EXTRA_SPACE = "54194304"


set_board_env() {
    mkdir -p ${IMAGE_ROOTFS}/etc/profile.d
    echo "export COURSIER_CACHE=/usr/share/mill/cache" > ${IMAGE_ROOTFS}/etc/profile.d/set_board_env.sh
    echo "export PERL5LIB=/usr/lib/perl5/vendor_perl/5.36.0/IO/:/usr/lib/perl5/vendor_perl/5.36.0/riscv64-linux/:/usr/lib/perl5/5.36.0/IO/:/usr/lib/perl5/5.36.0/riscv64-linux/" >> ${IMAGE_ROOTFS}/etc/profile.d/set_board_env.sh
}

ROOTFS_POSTPROCESS_COMMAND += "set_board_env;"
