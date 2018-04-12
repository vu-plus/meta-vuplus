require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180412"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "9c525e2028cf6d763d43ccfab959e3a8"
SRC_URI[sha256sum] = "7ac7b1a1b2e36d79ec0a05750fde1e1cc28501141dabdd7e653e188601186eee"
