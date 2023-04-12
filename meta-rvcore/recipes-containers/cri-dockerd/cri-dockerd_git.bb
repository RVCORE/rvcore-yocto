SUMMARY = "dockerd as a compliant Container Runtime Interface for Kubernetes"
HOMEPAGE = "https://github.com/Mirantis/cri-dockerd"

SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"


DEPENDS = ""

SRC_URI = "git://github.com/Mirantis/cri-dockerd.git;protocol=https;branch=master"


#SRCREV = "${AUTOREV}"
SRCREV = "bee8281cd5667af93ab6ff1352f70a76c823299a"
PV = "0.3.1"

GO_IMPORT = "github.com/Mirantis/cri-dockerd"


inherit go


do_compile() {
    cd ${S}/src/${GO_IMPORT}
    mkdir out
    #VERSION=$((git describe --abbrev=0 --tags | sed -e 's/v//') || echo $(cat VERSION)-$(git log -1 --pretty='%h'))
    #PRERELEASE=$(grep -q dev <<< "${VERSION}" && echo "pre" || echo "")
    #REVISION=$(git log -1 --pretty='%h')
    #go build -ldflags="-X github.com/Mirantis/cri-dockerd/version.Version='$VERSION}' -X github.com/Mirantis/cri-dockerd/version.PreRelease='$PRERELEASE' -X github.com/Mirantis/cri-dockerd/version.BuildTime='$BUILD_DATE' -X github.com/Mirantis/cri-dockerd/version.GitCommit='$REVISION'" -o cri-dockerd
    go build -o out/cri-dockerd
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${sysconfdir}/systemd/system
    install -m 755 ${S}/src/${GO_IMPORT}/out/${BPN}  ${D}/${bindir}
    install ${S}/src/${GO_IMPORT}/packaging/systemd/* ${D}${sysconfdir}/systemd/system
}
