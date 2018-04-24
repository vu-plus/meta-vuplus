require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180424"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "9dacfc0117e0f13acf8c32598682353b"
SRC_URI[sha256sum] = "95eec5674b02e7d9a9970cb03772cb38ffed5d609b1f7f2ab3afc4d317edef92"
