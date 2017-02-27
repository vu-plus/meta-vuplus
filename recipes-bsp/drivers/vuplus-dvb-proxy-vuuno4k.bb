require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170220"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "c922f74f99f79008109882c90c566af1"
SRC_URI[sha256sum] = "03422610bb9af7b950bb32cac66b20656d4c818079d443981a0f1b0d4b09e48e"
