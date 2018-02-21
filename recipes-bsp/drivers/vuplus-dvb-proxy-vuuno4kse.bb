require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180212"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "29e28addda1a81b2fcd00e3a54d9402c"
SRC_URI[sha256sum] = "dee17250e417076c831d78442d22b57965370b9cc7d63a3ff96ede58691820b3"
