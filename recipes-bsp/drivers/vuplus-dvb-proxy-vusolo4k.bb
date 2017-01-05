require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20161223"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ed6dfa9b4939f255d3bc7fcf3f7b2769"
SRC_URI[sha256sum] = "a87c38a7195e35cc087b4e0548dc8a57bf5c44d7aba26123416f8e8ec313b751"
