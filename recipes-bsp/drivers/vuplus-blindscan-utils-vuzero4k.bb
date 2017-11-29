require vuplus-blindscan-utils-arm.inc

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/tt2l08b" "${D}/${bindir}/tt2l08"
	install -m 0755 "${S}/tt2l08b_t2_scan" "${D}/${bindir}/tt2l08_t2_scan"
}

FILES_vuplus-blindscan-dvbc-utils-${MACHINE} = "\
	${bindir}/tt2l08 \
	${bindir}/tt2l08b_t2_scan \
"
