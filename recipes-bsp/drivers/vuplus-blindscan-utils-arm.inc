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

PV = "5.1"
PR = "r0"

SRC_URI = "http://code.vuplus.com/download/release/utils/vuplus-blindscan-utils-${PV}_arm.tar.bz2"

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

PLUGABLE_MODEL_BLINDSCAN_remove_vusolo4k = "bcm3148 bcm3466"
PLUGABLE_MODEL_BLINDSCAN_vuduo4k = "bcm3148 bcm3466"
PLUGABLE_MODEL_BLINDSCAN_vuduo4kse = "bcm3148 bcm3466"
PLUGABLE_MODEL_BLINDSCAN_vuuno4k = "bcm3148 bcm3466"
PLUGABLE_MODEL_BLINDSCAN_vuuno4kse = "bcm3148 bcm3466"
PLUGABLE_MODEL_BLINDSCAN_vuzero4k = "tt2l08b tt2l08b_t2_scan vuplus_si2166_blindscan"

do_install() {
        install -d "${D}${bindir}"
        for f in ${PLUGABLE_MODEL_BLINDSCAN}; do
                install -m 0755 "${S}/$f" "${D}${bindir}"
        done
}

do_install_append_vuzero4k() {
        mv "${D}${bindir}/tt2l08b" "${D}${bindir}/tt2l08"
        mv "${D}${bindir}/tt2l08b_t2_scan" "${D}${bindir}/tt2l08_t2_scan"
}

FILES_vuplus-blindscan-dvbs-utils-${MACHINE} = "\
        ${bindir}/vuplus_blindscan \
        ${bindir}/vuplus_6211_blindscan \
        ${bindir}/vuplus_6222_blindscan \
        ${bindir}/vuplus_si2166_blindscan \
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
