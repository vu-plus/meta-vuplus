require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171204"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "76e84624988b0dafba90793593ebcdbb"
SRC_URI[sha256sum] = "3980746e5852d00167e0b4b97f866b59359553564e8acc4c5e607974f768b495"
