require vuplus-platform-util.inc

RDEPENDS_${PN} += "gptfdisk"

PV="18.1"
SRCDATE = "20181113"
SRCDATE_PR = "r0"

SRC_URI += "\
	file://bp3flash.tar.gz \
"

do_install_append() {
	install -m 0755 ${WORKDIR}/bp3flash.py ${D}${bindir}
}

SRC_URI[md5sum] = "e24d814a7a122b945a52bd5755f5b590"
SRC_URI[sha256sum] = "6a8b4428aff578a9811206c1b35364648dd6942f669c6f6a5c7b3707dd2b5b63"
