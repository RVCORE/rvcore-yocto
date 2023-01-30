DESCRIPTION = "libwww-perl provides a simple and consistent API to the World Wide Web"
HOMEPAGE = "https://metacpan.org/release/libwww-perl"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=225d44a95fa3addb1da6d91187ab189f"
DEPENDS = "liburi-perl-native libhtml-parser-perl-native libhtml-tagset-perl-native"
RDEPENDS:${PN} += " \
	libhtml-parser-perl \
	libhtml-tagset-perl \
	liburi-perl \
	perl-module-digest-md5 \
	perl-module-net-ftp \
	"
BBCLASSEXTEND = "native"

PR = "r2"

SRC_URI = "https://cpan.metacpan.org/authors/id/O/OA/OALDERS/libwww-perl-${PV}.tar.gz;name=libwww-perl-${PV}"
SRC_URI[libwww-perl-6.43.sha256sum] = "e9849d7ee6fd0e89cc999e63d7612c951afd6aeea6bc721b767870d9df4ac40d"

S = "${WORKDIR}/libwww-perl-${PV}"

inherit cpan
