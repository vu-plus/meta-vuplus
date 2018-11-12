require vuplus-blindscan-utils-arm.inc

PLUGABLE_MODEL_BLINDSCAN = " \
	bcm3148 \
	bcm3466 \
"

FILES_vuplus-blindscan-dvbc-utils-${MACHINE} = "\
	${bindir}/bcm3148 \
"

FILES_vuplus-blindscan-dvbt-utils-${MACHINE} = "\
	${bindir}/bcm3466 \
"
