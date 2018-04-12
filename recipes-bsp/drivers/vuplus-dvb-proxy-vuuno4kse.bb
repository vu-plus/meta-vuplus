require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180412"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "e5b3bfe41ee92e6d4a0ab83f95b1483e"
SRC_URI[sha256sum] = "e380de472559fae28d01cc8b0683d1e41de502c32d82f60f7750d4ecaf9a5b52"
