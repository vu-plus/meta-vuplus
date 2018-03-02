require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180226"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "7204ca1df9e777ccfa2c54d9f09b603a"
SRC_URI[sha256sum] = "95309d720b0b4a146a632981d9edd3c23861072d8806151cb2e26bdaf6fd905a"
