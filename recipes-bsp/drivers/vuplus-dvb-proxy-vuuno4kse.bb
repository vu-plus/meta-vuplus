require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20190424"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "d53600fe86da873f9a854567e7c8a36f"
SRC_URI[sha256sum] = "7838f068278a6e89fea32d2f761722b781c58c5c6464227d1fa3e3f486bc5c51"
