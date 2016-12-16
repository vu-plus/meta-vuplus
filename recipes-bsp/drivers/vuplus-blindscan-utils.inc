DESCRIPTION = "Utils for blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGES = "vuplus-blindscan-dvbs-utils-${MACHINE} vuplus-blindscan-dvbc-utils-${MACHINE}"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES_vuplus-blindscan-dvbs-utils-${MACHINE} += "virtual/blindscan-dvbs"
RPROVIDES_vuplus-blindscan-dvbc-utils-${MACHINE} += "virtual/blindscan-dvbc"

PV = "4.2"
PR = "r5"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-blindscan-utils-${PV}.tar.bz2"

SRC_URI[md5sum] = "8e5b2f437b8d3f2b112300ca2e1539d5"
SRC_URI[sha256sum] = "d9b9fcfcafb8f89ded56c2bdd4c7bc6639bfdd93b8c8b78a23a40f4fa6219c2b"

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
	tt2l08 \
	tt2l08_t2_scan \
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
	${bindir}/tt2l08 \
	${bindir}/tt2l08_t2_scan \
	"

INHIBIT_PACKAGE_STRIP = "1"

PACKAGE_ARCH := "${MACHINE_ARCH}"

