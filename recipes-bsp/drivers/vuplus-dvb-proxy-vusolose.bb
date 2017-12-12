require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolose)$"

SRCDATE = "20171204"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "29677f9c975bf7fb2c59160d4fb3ee13"
SRC_URI[sha256sum] = "11494831cc548cff80ad4523a4bba25688f30b6735ce9b5897f1bb935252f76c"
