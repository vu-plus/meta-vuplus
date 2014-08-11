DESCRIPTION = "Utils for blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

PACKAGES = "vuplus-blindscan-dvbs-utils-${MACHINE} vuplus-blindscan-dvbc-utils-${MACHINE}"

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES_vuplus-blindscan-dvbs-utils-${MACHINE} += "virtual/blindscan-dvbs"
RPROVIDES_vuplus-blindscan-dvbc-utils-${MACHINE} += "virtual/blindscan-dvbc"

PV = "3.5"
PR = "r2"

SRC_URI = "http://archive.vuplus.com/download/utils/vuplus-blindscan-utils-${PV}.tar.bz2"

SRC_URI[md5sum] = "2d977dcee29c8b93d04cd818410be293"
SRC_URI[sha256sum] = "549c6aa1f480d072e2f37ce3f6a767c24a9b8be24a533f1340e491a3f71f7453"

S = "${WORKDIR}/blindscan-utils"

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
}

do_install_vuultimo() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_6211_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_6222_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/ssh108" "${D}/${bindir}"
	install -m 0755 "${S}/ssh108_t2_scan" "${D}/${bindir}"
}

do_install_vuuno() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_6211_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_6222_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/ssh108" "${D}/${bindir}"
	install -m 0755 "${S}/ssh108_t2_scan" "${D}/${bindir}"
}

do_install_vuduo2() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_6211_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_6222_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/ssh108" "${D}/${bindir}"
	install -m 0755 "${S}/ssh108_t2_scan" "${D}/${bindir}"
}

do_install_vusolo2() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_bcm7346_blindscan" "${D}/${bindir}"
}

do_install_vusolose() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tda1002x" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/vuplus_6211_blindscan" "${D}/${bindir}"
	install -m 0755 "${S}/ssh108" "${D}/${bindir}"
	install -m 0755 "${S}/ssh108_t2_scan" "${D}/${bindir}"
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
	"

INHIBIT_PACKAGE_STRIP = "1"

PACKAGE_ARCH := "${MACHINE_ARCH}"

