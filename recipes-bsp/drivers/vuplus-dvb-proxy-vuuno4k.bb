require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171219"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "117b3ea8f5fc66d6b058cb6a89992e28"
SRC_URI[sha256sum] = "4ec18b7002ec0caceaebbaa09bb6e39d489157c4110a1197ce16fde59a205f4a"
