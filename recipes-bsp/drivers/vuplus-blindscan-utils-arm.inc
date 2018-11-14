DESCRIPTION = "Utils for blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGES = "vuplus-blindscan-dvbs-utils-${MACHINE} vuplus-blindscan-dvbc-utils-${MACHINE}"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES_vuplus-blindscan-dvbs-utils-${MACHINE} += "virtual/blindscan-dvbs"
RPROVIDES_vuplus-blindscan-dvbc-utils-${MACHINE} += "virtual/blindscan-dvbc"

PV = "5.1"
PR = "r0"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-blindscan-utils-${PV}_arm.tar.bz2"

SRC_URI[md5sum] = "1744184485bdc6889f6556504e574c6a"
SRC_URI[sha256sum] = "518775bf3ff43ade300741232ce4d303d4aeaea09f1a7d7256e40a4fe95156ca"

S = "${WORKDIR}/blindscan-utils"

PLUGABLE_MODEL_BLINDSCAN = " \
	vuplus_blindscan \
	vuplus_6211_blindscan \
	vuplus_6222_blindscan \
	ssh108 \
	tt3l10 \
	tt2l08 \
	bcm3148 \
	ssh108_t2_scan \
	tt3l10_t2_scan \
	tt2l08_t2_scan \
	bcm3466 \
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
	${bindir}/tt3l10 \
	${bindir}/tt2l08 \
	${bindir}/bcm3148 \
	${bindir}/ssh108_t2_scan \
	${bindir}/tt3l10_t2_scan \
	${bindir}/tt2l08_t2_scan \
	${bindir}/bcm3466 \
"

INHIBIT_PACKAGE_STRIP = "1"

PACKAGE_ARCH := "${MACHINE_ARCH}"

INSANE_SKIP_${PN} = "already-stripped"
