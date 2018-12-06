require vuplus-platform-util.inc

RDEPENDS_${PN} += "gptfdisk mmc-utils"

PV="18.1"
SRCDATE = "20181205"
SRCDATE_PR = "r0"
PR_append = ".1"

SRC_URI += "\
	file://bp3flash.tar.gz \
"

do_install_append() {
	install -m 0755 ${WORKDIR}/bp3flash.py ${D}${bindir}
}

SRC_URI[md5sum] = "d624cc6b35b88c6e221d589e95342abc"
SRC_URI[sha256sum] = "c8ff6058622f8e6cbb904463f25e169caaa39278ffb38046ed7126aa888e304a"
