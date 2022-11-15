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

#for static compile spec06
SPEC06_DEPENDENCY = " libstdc++-staticdev \
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
                    "

#                      libio-compress-perl 
#                      libio-compress-lzma-perl 
#                      libio-socket-ssl-perl 
#                      libio-pty-perl 

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
                        ${SPEC06_DEPENDENCY} \
"

IMAGE_ROOTFS_EXTRA_SPACE = "24194304"
