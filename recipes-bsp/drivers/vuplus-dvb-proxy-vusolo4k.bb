require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170112"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "599730e6999d8c62ee464e37ce5d2644"
SRC_URI[sha256sum] = "c8b3ebbe655c120ab04bd8262bd3ecb7cbad761610ec5ee08950d8f3016fb369"
