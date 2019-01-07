require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20190104"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "68d57cc58ca08293a417060544a3cf79"
SRC_URI[sha256sum] = "36982446fb0e28ecbc243f64fb19640dcb58f32db5e7418a0a3d464777b56e29"
