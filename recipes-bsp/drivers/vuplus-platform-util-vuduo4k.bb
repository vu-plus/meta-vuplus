require vuplus-platform-util.inc

RDEPENDS_${PN} += "gptfdisk"

PV="18.1"
SRCDATE = "20181121"
SRCDATE_PR = "r0"

SRC_URI += "\
	file://bp3flash.tar.gz \
"

do_install_append() {
	install -m 0755 ${WORKDIR}/bp3flash.py ${D}${bindir}
}

SRC_URI[md5sum] = "1db2a68d324d97735697f19ec5be5aca"
SRC_URI[sha256sum] = "15c1ce80a89ce6fd7d9e1cfaf4dcf7dc33dee79126cfcb6684c1dda7478ddb6e"
