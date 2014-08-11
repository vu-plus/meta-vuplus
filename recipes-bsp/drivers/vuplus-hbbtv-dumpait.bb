DESCRIPTION = "dumpait"

PRIORITY = "required"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.GPLv3;md5=5ed852a46d22220a8b07a68e564d84c7"

DEPENDS = "libdvbsi++"

SRC_URI = "git://code.vuplus.com/git/dumpait.git"
S = "${WORKDIR}/git"
DESTDIR = "enigma2/python/Plugins/Extensions/HbbTV"

inherit gitpkgv
SRCREV = "74fd7808407bee7bd3f5518f123b900de29fd792"
PV = "git${SRCPV}"
PR = "r1"
PKGV = "git${GITPKGV}"

RREPLACES_${PN} = "vuplus-opera-dumpait"
RCONFLICTS_${PN} = "vuplus-opera-dumpait"

inherit autotools-brokensep pkgconfig

do_install() {
	install -d ${D}/usr/lib/${DESTDIR}
	install -m 0755 ${S}/src/dumpait ${D}/usr/lib/${DESTDIR}
}

FILES_${PN} = "${libdir}/${DESTDIR}/dumpait"
FILES_${PN}-dbg += "${libdir}/${DESTDIR}/.debug/dumpait"
