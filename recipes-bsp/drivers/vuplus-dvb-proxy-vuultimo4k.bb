require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180208"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "02acffabc43d2d65165eb52469ad8070"
SRC_URI[sha256sum] = "287038a4f854b6168c1b1490d99849e737df011fc8e063ed4af5cbbe96da0d75"
