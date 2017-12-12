require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuduo2)$"

SRCDATE = "20171204"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "5fed2b504efa69b9cb4f370fbb0b262e"
SRC_URI[sha256sum] = "cf9d0090200a2ab220234ef1fc94a430adcb6a78dab8012d8cb5265d2a2d9d5a"
