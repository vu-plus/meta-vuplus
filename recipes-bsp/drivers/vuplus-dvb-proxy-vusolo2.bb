require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolo2)$"

SRCDATE = "20170822"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ea0501575f48182b80689f53900bfeb6"
SRC_URI[sha256sum] = "836c6fde1c52b58f8e9c7172e51765c97c2dc2288bbcec4c14710e5fa6a911d2"
