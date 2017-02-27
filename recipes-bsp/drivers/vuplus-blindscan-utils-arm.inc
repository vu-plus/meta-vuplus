DESCRIPTION = "Utils for blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGES = "vuplus-blindscan-dvbs-utils-${MACHINE} vuplus-blindscan-dvbc-utils-${MACHINE}"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES_vuplus-blindscan-dvbs-utils-${MACHINE} += "virtual/blindscan-dvbs"
RPROVIDES_vuplus-blindscan-dvbc-utils-${MACHINE} += "virtual/blindscan-dvbc"

PV = "4.7"
PR = "r0"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-blindscan-utils-${PV}_arm.tar.bz2"

SRC_URI[md5sum] = "003d552f3c62f84f00a9bad288e131be"
SRC_URI[sha256sum] = "27c30a9e332032b525af5a506e1337d5f2e68124035f6907a440b1836e084aa6"

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
