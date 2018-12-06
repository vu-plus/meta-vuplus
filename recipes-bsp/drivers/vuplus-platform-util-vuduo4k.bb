require vuplus-platform-util.inc

RDEPENDS_${PN} += "gptfdisk mmc-utils"

PV="18.1"
SRCDATE = "20181130"
SRCDATE_PR = "r0"
PR_append = ".1"

SRC_URI += "\
	file://bp3flash.tar.gz \
"

do_install_append() {
	install -m 0755 ${WORKDIR}/bp3flash.py ${D}${bindir}
}

SRC_URI[md5sum] = "be35abfdc2598364a94e543eb2e9fffe"
SRC_URI[sha256sum] = "27204d9183dd04fc8d8f89c5f7956873fe018c49a4d1870b9d633463f66aa525"
