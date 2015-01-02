require conf/license/openpli-gplv2.inc

PV = "1.0"
PR = "r2"

SRC_URI = " \
        file://vuplus-shutdown.sh \
        file://turnoff_power \
"

DEPENDS_append = " update-rc.d-native"

do_install() {
        install -d ${D}${sysconfdir}/init.d/
	install -d ${D}${sysconfdir}/rc0.d
        install -m 0755 ${WORKDIR}/vuplus-shutdown.sh ${D}${sysconfdir}/init.d/vuplus-shutdown
        install -d ${D}${bindir}
        install -m 0755 ${WORKDIR}/turnoff_power ${D}${bindir}
        update-rc.d -r ${D} vuplus-shutdown start 89 0 .
}

