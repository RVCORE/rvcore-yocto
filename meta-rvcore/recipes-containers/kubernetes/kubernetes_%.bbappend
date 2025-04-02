FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
COMPATIBLE_HOST = "(x86_64.*|arm.*|aarch64.*|riscv64.*)-linux"


do_compile() {
        export GOPATH="${S}/src/import/.gopath:${S}/src/import/vendor:${STAGING_DIR_TARGET}/${prefix}/local/go:${WORKDIR}/git/"
        cd ${S}

        # Build the host tools first, using the host compiler
#       export GOARCH="${BUILD_GOARCH}"
        # Pass the needed cflags/ldflags so that cgo can find the needed headers files and libraries
#       export CGO_ENABLED="1"
#       export CFLAGS="${BUILD_CFLAGS}"
#       export LDFLAGS="${BUILD_LDFLAGS}"
#       export CGO_CFLAGS="${BUILD_CFLAGS}"
        # as of go 1.15.5, there are some flags the CGO doesn't like. Rather than
        # clearing them all, we sed away the ones we don't want.
#       export CGO_LDFLAGS="$(echo ${BUILD_LDFLAGS} | sed 's/-Wl,-O1//g' | sed 's/-Wl,--dynamic-linker.*?\( \|$\)//g')"
#       export CC="${BUILD_CC}"
#       export LD="${BUILD_LD}"

        # set the toolchain to local to avoid an attempted fetch of
        # valiation by the build
        # https://github.com/actions/setup-go/issues/420
        export GOTOOLCHAIN="local"

        # make generated_files GO="go" KUBE_BUILD_PLATFORMS="${HOST_GOOS}/${BUILD_GOARCH}"
        # is replaced by:
        # ./hack/update-codegen.sh
        # but we don't appear to need either anymore, but we leave them as a placeholder/reminder

        # Build the target binaries
        export GOARCH="${TARGET_GOARCH}"
        # Pass the needed cflags/ldflags so that cgo can find the needed headers files and libraries
        export CGO_ENABLED="1"
        export CGO_CFLAGS="${CFLAGS} --sysroot=${STAGING_DIR_TARGET}"
        export CGO_LDFLAGS="${LDFLAGS} --sysroot=${STAGING_DIR_TARGET}"
        export CFLAGS=""
        export LDFLAGS=""
        export CC="${CC}"
        export LD="${LD}"
        export GOBIN=""
#       export GODEBUG="cgocheck=2"
        export GOEXPERIMENT=cgocheck2
        export GOFLAGS="-trimpath"

        # to limit what is built, use 'WHAT', i.e. make WHAT=cmd/kubelet
        #make cross CGO_FLAGS=${CGO_FLAGS} GO=${GO} KUBE_BUILD_PLATFORMS=${GOOS}/${GOARCH} GOLDFLAGS="" DBG=1
        KUBE_BUILD_PLATFORMS=${GOOS}/${GOARCH} make
}

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${systemd_unitdir}/system/
    install -d ${D}${systemd_unitdir}/system/kubelet.service.d/

    install -d ${D}${sysconfdir}/kubernetes/manifests/

    install -m 755 -D ${S}/_output/local/go/bin/${TARGET_GOOS}_${TARGET_GOARCH}/* ${D}/${bindir}

    install -m 0644 ${WORKDIR}/git/release/cmd/kubepkg/templates/latest/deb/kubelet/lib/systemd/system/kubelet.service ${D}${systemd_unitdir}/system/
    install -m 0644 ${WORKDIR}/git/release/cmd/kubepkg/templates/latest/deb/kubeadm/10-kubeadm.conf  ${D}${systemd_unitdir}/system/kubelet.service.d/

    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        install -d "${D}${BIN_PREFIX}${base_bindir}"
        install -m 755 "${UNPACKDIR}/k8s-init" "${D}${BIN_PREFIX}${base_bindir}"

        install -d ${D}${sysconfdir}/sysctl.d
        install -m 0644 "${UNPACKDIR}/99-kubernetes.conf" "${D}${sysconfdir}/sysctl.d"
    fi
}


