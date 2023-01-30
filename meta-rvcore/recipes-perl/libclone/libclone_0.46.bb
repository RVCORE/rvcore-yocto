SUMMARY = "Perl module for recursively copy Perl datatypes"
HOMEPAGE = "https://metacpan.org/pod/Clone"
DESCRIPTION = "Perl module for recursively copy Perl datatypes"

SECTION = "libs"
LICENSE = "CLOSED"

SRCNAME = "Clone"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GA/GARU/Clone-0.46.tar.gz"
SRC_URI[md5sum] = "cafa8984a2c2e005e54b27dd1e3f0afe"
SRC_URI[sha256sum] = "aadeed5e4c8bd6bbdf68c0dd0066cb513e16ab9e5b4382dc4a0aafd55890697b"

#UPSTREAM_CHECK_REGEX = "XML\-NamespaceSupport\-(?P<pver>(\d+\.\d+))(?!_\d+).tar"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit cpan ptest-perl

RDEPENDS:${PN}-ptest += "perl-module-test-more"

BBCLASSEXTEND="native nativesdk"

