require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170112"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "230238ee41a558dec785d44547b25c1f"
SRC_URI[sha256sum] = "7142bc62f025481a71371bf7f17278f02bb6b70de14a70af18e275c2fcf1172b"
