require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171222"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "52391326f55af4a857f38ea1e546b3b9"
SRC_URI[sha256sum] = "963a348677ae8384b2ee9b5f1120efad113fc90ecfc5d1b4c48afcddaf1df23c"
