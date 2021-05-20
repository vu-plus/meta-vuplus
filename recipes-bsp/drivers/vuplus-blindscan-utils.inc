DESCRIPTION = "Utils for blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PACKAGES = "vuplus-blindscan-utils-${MACHINE}-dbg \
            vuplus-blindscan-dvbs-utils-${MACHINE} \
            vuplus-blindscan-dvbc-utils-${MACHINE} \
           "

PROVIDES += "virtual/blindscan-dvbs virtual/blindscan-dvbc"
RPROVIDES_vuplus-blindscan-dvbs-utils-${MACHINE} += "virtual/blindscan-dvbs"
RPROVIDES_vuplus-blindscan-dvbc-utils-${MACHINE} += "virtual/blindscan-dvbc"

PV = "4.4"
PR = "r5"

SRC_URI = "http://code.vuplus.com/download/release/utils/vuplus-blindscan-utils-${PV}.tar.bz2"

SRC_URI[md5sum] = "b6d485516762453dcb829d914b4e06b3"
SRC_URI[sha256sum] = "cb7045db4aee0d1ef9392231d2bfc7f843e9e9ec82ceb17d86dd7c1fe56bef4b"

S = "${WORKDIR}/blindscan-utils"

PLUGABLE_MODEL_BLINDSCAN = "\
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

PLUGABLE_MODEL_BLINDSCAN_vuduo = "tda1002x"
PLUGABLE_MODEL_BLINDSCAN_vusolo = "tda1002x"
PLUGABLE_MODEL_BLINDSCAN_vuzero = "tda1002x"
PLUGABLE_MODEL_BLINDSCAN_vusolo2 = "tda1002x vuplus_bcm7346_blindscan"

do_install() {
        install -d "${D}${bindir}"
        for f in ${PLUGABLE_MODEL_BLINDSCAN}; do
                install -m 0755 "${S}/$f" "${D}${bindir}"
        done
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

# tda1002x is stripped, just that one
INSANE_SKIP_${PN} = "already-stripped"
