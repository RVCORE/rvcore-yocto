SUMMARY = "minikube implements a local Kubernetes cluster on macOS, Linux, and Windows. \
minikube's primary goals are to be the best tool for local Kubernetes application development \
and to support all Kubernetes features that fit."

HOMEPAGE = "https://github.com/kubernetes/minikube"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c416a5ae58e0c8a08c8e33c94f1ef618"

SECTION = "devel"
DEPENDS = ""

SRC_URI = "git://github.com/kubernetes/minikube.git;branch=master;protocol=https;"


SRCREV = "4442f78a66982955579b957f032e5b3b9a6cd9de"
PV = "v1.29.0"

GO_IMPORT = "github.com/kubernetes/minikube"
#S = "${WORKDIR}/git/src/github.com/kubernetes/kubernetes"


inherit go



do_compile() {
    export https_proxy=http://192.168.100.199:1091
    cd ${S}/src/${GO_IMPORT}
    make
}

do_configure[noexec] = "1"
do_compile[network] = "1"


do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/src/${GO_IMPORT}/out/${BPN}  ${D}/${bindir}
}
