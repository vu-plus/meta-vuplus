DESCRIPTION = "Utils for blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGES = "vuplus-blindscan-dvbs-utils-${MACHINE} vuplus-blindscan-dvbc-utils-${MACHINE}"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES_vuplus-blindscan-dvbs-utils-${MACHINE} += "virtual/blindscan-dvbs"
RPROVIDES_vuplus-blindscan-dvbc-utils-${MACHINE} += "virtual/blindscan-dvbc"

PV = "3.8"
PR = "r4"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-blindscan-utils-${PV}.tar.bz2"

SRC_URI[md5sum] = "0efbbfd6816d00bd808d2897995a87a6"
SRC_URI[sha256sum] = "486a22c76e051e98dcc54129ca62ad05d41c2fb78a5cdf9324ca161fece00cd7"

S = "${WORKDIR}/blindscan-utils"

PLUGABLE_MODEL_BLINDSCAN = " \
        tda1002x \
        vuplus_blindscan \
        vuplus_6211_blindscan \
        vuplus_6222_blindscan \
        ssh108 \
        ssh108_t2_scan \
        tt3l10 \
        tt3l10_t2_scan \
"

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
}

do_install_vuuno() {
        install -d "${D}/${bindir}"
        for f in ${PLUGABLE_MODEL_BLINDSCAN}; do
                install -m 0755 "${S}/$f" "${D}/${bindir}"
        done
}

do_install_vuultimo() {
        install -d "${D}/${bindir}"
        for f in ${PLUGABLE_MODEL_BLINDSCAN}; do
                install -m 0755 "${S}/$f" "${D}/${bindir}"
        done
}

do_install_vuduo2() {
        install -d "${D}/${bindir}"
        for f in ${PLUGABLE_MODEL_BLINDSCAN}; do
                install -m 0755 "${S}/$f" "${D}/${bindir}"
        done
}

do_install_vusolose() {
        install -d "${D}/${bindir}"
        for f in ${PLUGABLE_MODEL_BLINDSCAN}; do
                install -m 0755 "${S}/$f" "${D}/${bindir}"
        done
}

do_install_vusolo2() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_bcm7346_blindscan" "${D}/${bindir}"
}

FILES_vuplus-blindscan-dvbs-utils-${MACHINE} = "\
	${bindir}/vuplus_blindscan \
	${bindir}/vuplus_6211_blindscan \
	${bindir}/vuplus_6222_blindscan \
	${bindir}/vuplus_bcm7346_blindscan \
	"

FILES_vuplus-blindscan-dvbc-utils-${MACHINE} = "\
	${bindir}/tda1002x \
	${bindir}/ssh108 \
	${bindir}/ssh108_t2_scan \
	${bindir}/tt3l10 \
	${bindir}/tt3l10_t2_scan \
	"

INHIBIT_PACKAGE_STRIP = "1"

PACKAGE_ARCH := "${MACHINE_ARCH}"

