SUMMARY = "Perl module for Date conversion routines"
HOMEPAGE = "https://metacpan.org/pod/HTTP::Date"
DESCRIPTION = "Perl module for Date conversion routines"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

SRCNAME = "HTTP-Date"

LIC_FILES_CHKSUM = "file://LICENSE;md5=0ab035c51ba79096da6813695e254b1d"

SRC_URI = "${CPAN_MIRROR}/authors/id/O/OA/OALDERS/${SRCNAME}-${PV}.tar.gz"
SRC_URI[md5sum] = "2ecbb3aedf6aef062605191813ca3027"
SRC_URI[sha256sum] = "365d6294dfbd37ebc51def8b65b81eb79b3934ecbc95a2ec2d4d827efe6a922b"

#UPSTREAM_CHECK_REGEX = "XML\-NamespaceSupport\-(?P<pver>(\d+\.\d+))(?!_\d+).tar"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit cpan ptest-perl

RDEPENDS:${PN}-ptest += "perl-module-test-more"

BBCLASSEXTEND="native nativesdk"

