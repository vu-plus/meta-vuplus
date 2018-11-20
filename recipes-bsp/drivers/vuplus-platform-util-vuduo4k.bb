require vuplus-platform-util.inc

RDEPENDS_${PN} += "gptfdisk"

PV="18.1"
SRCDATE = "20181120"
SRCDATE_PR = "r0"

SRC_URI += "\
	file://bp3flash.tar.gz \
"

do_install_append() {
	install -m 0755 ${WORKDIR}/bp3flash.py ${D}${bindir}
}

SRC_URI[md5sum] = "1b207a8924c990d28fabd87d97447f9c"
SRC_URI[sha256sum] = "50f9dd94b0a06b3f7ddeb88b8766e6b79853f5460c7c0ac5c29ce6c1b656a882"
