require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20181204"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "9dcf1f202d8f95b5a02ccbe2071065dc"
SRC_URI[sha256sum] = "5e5807874bda4004583efbf1a8309a20034000071369f47dd2bb328141d8d4ce"
