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



# for compile verilator
IMAGE_INSTALL:append = "e2fsprogs \
                        e2fsprogs-resize2fs \
                        apache2 \
                        python3-pip \
                        binutils \
                        vim \
                        mariadb \
                        perl \
                        opencv \
                        time \
                        nerdctl \
                        ccache \
                        bison \
                        git \
                        make \
                        cmake \
                        ninja \
                        tzdata \
                        ldd \
                        gdb \
                        dpdk \
                        spdk \
                        openjdk \
                        libvirt \
                        kubernetes \
                        etcd \
                        tcpdump \
                        ncnn \
                        numactl \
                        graphviz \
                        lcov \
                        libsdl2 \
                        libsdl2-dev \
                        libsdl2-staticdev \
                        qemu \
                        docker-moby \
                        acl \
                        redis \
                        tcl \
                        openssh \
                        nodejs \
                        fuse3 \
                        meson \
                        lmbench \
                        ipset \
                        perf \
"


#                        openvswitch

IMAGE_ROOTFS_EXTRA_SPACE = "54194304"
