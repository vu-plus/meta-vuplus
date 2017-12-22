require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20171222"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "42c4d84de5637f1a7cfcf49efbbbb572"
SRC_URI[sha256sum] = "42a8ca360b08969ca6d956d4d8a068be7b3372d2e86d777ccdd93e6800137b58"
