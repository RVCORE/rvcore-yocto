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
OPENSTACK_DEPS = " \
            libxslt \
            libxslt-dev \
            cargo \
            cargo-dev \
            python3-jinja2 \
            python3-pastedeploy \
            python3-sqlalchemy \
            python3-alembic \
            python3-decorator \
            python3-eventlet \
            python3-httplib2 \
            python3-netaddr \
            python3-netifaces \
            python3-requests \
            python3-stevedore \
            python3-pyroute2 \
            python3-mako \
            python3-wrapt \
            python3-dnspython \
            python3-markupsafe \
            python3-appdirs \
            python3-cryptography \
            python3-jmespath \
            python3-jsonpatch \
            python3-msgpack \
            python3-fasteners \
            python3-rfc3986-validator \
            python3-pyinotify \
            python3-cachetools \
            python3-bcrypt \
            python3-yappi \
            python3-jsonschema \
            python3-simplejson \
            python3-charset-normalizer \
            python3-idna \
            python3-cython \
            python3-wheel \
            python3-urllib3 \
            python3-certifi \
            python3-pycparser \
            python3-jsonpointer \
            python3-pynacl \
            python3-pytz \
            python3-wheel \
            python3-cffi \
            python3-setuptools \
            python3-lxml \
            python3-iso8601 \
            python3-psutil \
            python3-pbr \
            python3-paramiko \
            python3-setuptools-rust \
            python3-setuptools-scm \
            python3-sqlparse \
            python3-testtools \
            python3-async-timeout \
            python3-sortedcontainers \
            python3-amqp \
            python3-kombu \
            python3-pyroute2 \
            python3-routes \
            python3-deprecated \
            python3-debtcollector \
            python3-cliff \
            python3-futurist \
            python3-keystoneauth1 \
            mariadb \
            python3-autopage \
            python3-castellan \
            python3-cursive \
            python3-dogpile-cache \
            python3-fixtures \
            python3-jwcrypto \
            python3-keystonemiddleware \
            python3-microversion-parse \
            python3-nova \
            python3-openstacksdk \
            python3-os-brick \
            python3-osc-lib \
            python3-os-client-config \
            python3-oslo-cache \
            python3-oslo-concurrency \
            python3-oslo-config \
            python3-oslo-context \
            python3-oslo-db \
            python3-oslo-i18n \
            python3-oslo-limit \
            python3-oslo-messaging \
            python3-oslo-metrics \
            python3-oslo-middleware \
            python3-oslo-policy \
            python3-oslo-privsep \
            python3-oslo-reports \
            python3-oslo-rootwrap \
            python3-oslo-serialization \
            python3-oslo-service \
            python3-oslo-upgradecheck \
            python3-oslo-utils \
            python3-oslo-versionedobjects \
            python3-os-resource-classes \
            python3-os-service-types \
            python3-os-traits \
            python3-os-vif \
            python3-os-win \
            python3-ovs \
            python3-ovsdbapp \
            python3-paste \
            python3-prometheus-client \
            python3-pycadf \
            python3-pyparsing \
            python3-pyperclip \
            python3-python-barbicanclient \
            python3-python-cinderclient \
            python3-python-glanceclient \
            python3-python-keystoneclient \
            python3-python-neutronclient \
            python3-pyyaml \
            python3-redis \
            python3-repoze-lru \
            python3-requestsexceptions \
            python3-retrying \
            python3-rfc3986 \
            python3-setuptools \
            python3-statsd \
            python3-tenacity \
            python3-testresources \
            python3-testscenarios \
            python3-tooz \
            python3-tzdata \
            python3-vine \
            python3-voluptuous \
            python3-warlock \
            python3-wcwidth \
            python3-webob \
            python3-numpy \
            python3-websockify \
            python3-typing-extensions \
            python3-sqlalchemy-migrate \
            python3-prettytable \
            python3-cmd2 \
            python3-tempita \
            python3-setuptools \
            python3-logutils \
            python3-ncclient \
            python3-setproctitle \
            python3-os-ken \
            python3-osprofiler \
            python3-neutron \
            python3-neutron-lib \
            python3-pecan \
            python3-python-designateclient \
            python3-python-novaclient \
            python3-oslo-log \
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

GCC_TOOLS = "gcc gcc-symlinks gcc-plugins \
               gcc-dev \
               gcc-doc \
               gcov gcov-symlinks \
               g++ g++-symlinks\
               cpp cpp-symlinks \
               libgomp \
               libgomp-dev \
               libgomp-staticdev \
"


# for compile verilator
IMAGE_INSTALL:append = " openjdk \
                        openjdk-demo \
                        openjdk-doc \
                        openjdk-dev \
                        e2fsprogs \
                        e2fsprogs-resize2fs \
                        python3-pip \
                        binutils \
                        perl-misc \
                        ${GCC_TOOLS} \
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
                        ${OPENSTACK_DEPS} \
                        qemu \
                        acl \
                        redis \
                        tcl \
                        dpdk \
                        ${SPDK_DEPENDS} \
                        openssh-misc \
"

IMAGE_ROOTFS_EXTRA_SPACE = "54194304"


set_board_env() {
    mkdir -p ${IMAGE_ROOTFS}/etc/profile.d
    echo "export COURSIER_CACHE=/usr/share/mill/cache" > ${IMAGE_ROOTFS}/etc/profile.d/set_board_env.sh
    echo "export PERL5LIB=/usr/lib/perl5/vendor_perl/5.36.0/IO/:/usr/lib/perl5/vendor_perl/5.36.0/riscv64-linux/:/usr/lib/perl5/5.36.0/IO/:/usr/lib/perl5/5.36.0/riscv64-linux/" >> ${IMAGE_ROOTFS}/etc/profile.d/set_board_env.sh
}

ROOTFS_POSTPROCESS_COMMAND += "set_board_env;"
