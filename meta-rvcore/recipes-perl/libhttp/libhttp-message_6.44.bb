SUMMARY = "Perl module for supporting HTTP style request message"
HOMEPAGE = "https://metacpan.org/pod/HTTP::Request"
DESCRIPTION = "Perl module for supporting HTTP style request message"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

SRCNAME = "HTTP-Message"
RDEPENDS:${PN} = "libclone"

LIC_FILES_CHKSUM = "file://LICENSE;md5=238a7c766784094b3aa9c3e7a010207d"

SRC_URI = "${CPAN_MIRROR}/authors/id/O/OA/OALDERS/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "926a077669a7828c5ca39b5cf7735625"
SRC_URI[sha256sum] = "398b647bf45aa972f432ec0111f6617742ba32fc773c6612d21f64ab4eacbca1"

#UPSTREAM_CHECK_REGEX = "XML\-NamespaceSupport\-(?P<pver>(\d+\.\d+))(?!_\d+).tar"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit cpan ptest-perl

RDEPENDS:${PN}-ptest += "perl-module-test-more"

BBCLASSEXTEND="native nativesdk"

