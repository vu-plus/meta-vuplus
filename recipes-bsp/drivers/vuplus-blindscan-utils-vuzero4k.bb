require vuplus-blindscan-utils-arm.inc

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tt2l08b" "${D}/${bindir}/tt2l08"
	install -m 0755 "${S}/tt2l08b_t2_scan" "${D}/${bindir}/tt2l08_t2_scan"
	install -m 0755 "${S}/vuplus_si2166_blindscan" "${D}/${bindir}/vuplus_si2166_blindscan"
}

FILES_vuplus-blindscan-dvbs-utils-${MACHINE} = "\
	${bindir}/vuplus_si2166_blindscan \
"

FILES_vuplus-blindscan-dvbc-utils-${MACHINE} = "\
	${bindir}/tt2l08 \
	${bindir}/tt2l08_t2_scan \
"
