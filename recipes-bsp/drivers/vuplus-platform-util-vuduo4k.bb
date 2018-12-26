require vuplus-platform-util.inc

RDEPENDS_${PN} += "gptfdisk mmc-utils"

PV="18.1"
SRCDATE = "20181226"
SRCDATE_PR = "r0"
PR_append = ".2"

SRC_URI += "\
	file://bp3flash.tar.gz \
"

do_install_append() {
	install -m 0755 ${WORKDIR}/bp3flash.py ${D}${bindir}
}

SRC_URI[md5sum] = "9582cdd519e84b0f34c94ae9ecc8cc9e"
SRC_URI[sha256sum] = "4f920af446b67727c873e8ea12045b531e9ff7faba8b28f876dc13a59456a8fe"
