require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20160412"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "2867dc5b790a64526391415bc509b2d1"
SRC_URI[sha256sum] = "8ee1d4369602abc7729ee7742d89a8f179a0075b9b5d6d5033aaead457f89c74"
