require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171129"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "106874d0aa78284b98f36d333bcb03e3"
SRC_URI[sha256sum] = "163351282ccd8bf6c5450781ce471ec6ed1dc748fcab52456fe914c998a59426"
