require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180212"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ef95eeffab62e7146de2753e4552b663"
SRC_URI[sha256sum] = "75af0e40a29a205e2004c803c83bf8298976d323011ddd9147ce5ed8118722e7"
