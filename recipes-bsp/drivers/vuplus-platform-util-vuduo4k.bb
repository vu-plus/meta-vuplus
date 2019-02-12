require vuplus-platform-util.inc

RDEPENDS_${PN} += "gptfdisk mmc-utils"

PV="18.1"
SRCDATE = "20190130"
SRCDATE_PR = "r0"
PR_append = ".2"

SRC_URI += "\
	file://bp3flash.tar.gz \
"

do_install_append() {
	install -m 0755 ${WORKDIR}/bp3flash.py ${D}${bindir}
}

SRC_URI[md5sum] = "3ee429c48cecb631684087a56cab349e"
SRC_URI[sha256sum] = "977f440a7bc2657712543bc2d7fb3a3d93650d992702567a6bbcc2f3a4aed7f1"
