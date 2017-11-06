DESCRIPTION = "Utils for blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGES = "vuplus-blindscan-dvbs-utils-${MACHINE} vuplus-blindscan-dvbc-utils-${MACHINE}"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES_vuplus-blindscan-dvbs-utils-${MACHINE} += "virtual/blindscan-dvbs"
RPROVIDES_vuplus-blindscan-dvbc-utils-${MACHINE} += "virtual/blindscan-dvbc"

PV = "4.8"
PR = "r0"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-blindscan-utils-${PV}_arm.tar.bz2"

SRC_URI[md5sum] = "7dea1e6dd1a9e53ef5c29750cf834d96"
SRC_URI[sha256sum] = "e35a4ef006ae66b79c224f3f6c5364a402bf4512fc39d3df756ca22a88d4ab0b"

S = "${WORKDIR}/blindscan-utils"

PLUGABLE_MODEL_BLINDSCAN = " \
	vuplus_blindscan \
	vuplus_6211_blindscan \
	vuplus_6222_blindscan \
	ssh108 \
	ssh108_t2_scan \
	tt3l10 \
	tt3l10_t2_scan \
	tt2l08 \
	tt2l08_t2_scan \
"

do_install() {
	install -d "${D}/${bindir}"
	for f in ${PLUGABLE_MODEL_BLINDSCAN}; do
		install -m 0755 "${S}/$f" "${D}/${bindir}"
	done
}

FILES_vuplus-blindscan-dvbs-utils-${MACHINE} = "\
	${bindir}/vuplus_blindscan \
	${bindir}/vuplus_6211_blindscan \
	${bindir}/vuplus_6222_blindscan \
	"

FILES_vuplus-blindscan-dvbc-utils-${MACHINE} = "\
	${bindir}/ssh108 \
	${bindir}/ssh108_t2_scan \
	${bindir}/tt3l10 \
	${bindir}/tt3l10_t2_scan \
	tt2l08 \
	tt2l08_t2_scan \
	"

INHIBIT_PACKAGE_STRIP = "1"

PACKAGE_ARCH := "${MACHINE_ARCH}"

INSANE_SKIP_${PN} = "already-stripped"
