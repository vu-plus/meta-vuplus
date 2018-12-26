require vuplus-platform-util.inc

RDEPENDS_${PN} += "gptfdisk mmc-utils"

PV="18.1"
SRCDATE = "20181213"
SRCDATE_PR = "r0"
PR_append = ".2"

SRC_URI += "\
	file://bp3flash.tar.gz \
"

do_install_append() {
	install -m 0755 ${WORKDIR}/bp3flash.py ${D}${bindir}
}

SRC_URI[md5sum] = "967025d0030a5a577ead89b275cb0c86"
SRC_URI[sha256sum] = "bee9efa4cf8e46c736b2c4d71dcb0c0cd1f475076d4b0aeab5538b4c021391da"
