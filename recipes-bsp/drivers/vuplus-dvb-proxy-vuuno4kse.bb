require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20170831"
SRCDATE_PR = "r4"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "f3ef501dc0a30ac0a775f553b9e0b044"
SRC_URI[sha256sum] = "2b362e519a3b7e9aebf4ba22e13529c7ad9d520c1cc0cc1fa001688fe6336021"
