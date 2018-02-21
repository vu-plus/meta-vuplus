require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180209"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b9a3e73e810c269755179ea48c2062f9"
SRC_URI[sha256sum] = "4173de0b69cbf1fd8f29dd416dab5c9a16738bcfb942ba084bb17e68717c22fa"
