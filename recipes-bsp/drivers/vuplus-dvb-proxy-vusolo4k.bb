require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171222"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "8286b27560482eb30658782a4084593a"
SRC_URI[sha256sum] = "6685bdb00018873b51c67cce9c9cc00bad579b6e90612c9881760d9d32ac1748"
