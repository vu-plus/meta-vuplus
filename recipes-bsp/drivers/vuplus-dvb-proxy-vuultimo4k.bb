require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180406"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "73bb82938e7ca58f3a327c66824fdf06"
SRC_URI[sha256sum] = "82d23c044654eff1c23789efbbe14d3452ed0f09e6c22c1b8c9617cc403566db"
