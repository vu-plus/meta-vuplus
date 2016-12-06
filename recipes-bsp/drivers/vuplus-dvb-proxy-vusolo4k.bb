require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20161130"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "1a9a26fbff942f4de93c84840c0a4070"
SRC_URI[sha256sum] = "88a9944c50fe8903db51b9dc933e955293fb1a003789cc3d6a4f1fec2d0b7078"
