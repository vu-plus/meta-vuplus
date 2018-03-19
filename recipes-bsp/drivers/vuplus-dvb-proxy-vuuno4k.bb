require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180315"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "82ae9f00ff93563f418736a76b0bdbbb"
SRC_URI[sha256sum] = "10308bca10ddcf8cf3bb7e2aab24a0116a9ce41e5f1a9f54b9f75703b0ea1263"
