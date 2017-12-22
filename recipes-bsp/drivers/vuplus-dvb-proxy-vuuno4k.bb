require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171222"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "6e6b1ea68b437ce48da7dde079d3a7cc"
SRC_URI[sha256sum] = "742ee780494d45cf461e2903eada1bea56599a0a42186047e04e2852d92283b0"
