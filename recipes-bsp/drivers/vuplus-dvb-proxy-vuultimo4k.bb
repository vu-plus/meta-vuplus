require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171030"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b6a22b0a0ffb0877594aa8d997575efb"
SRC_URI[sha256sum] = "362607fbc3d7403c56289451ba86095c92c6be6941e8f49e25d1367bf2b8be47"
