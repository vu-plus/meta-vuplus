require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20171219"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "9f6158ef3817b0cc38b58c0e3decbf71"
SRC_URI[sha256sum] = "47541273a30f1da5f01adccb77c8bd0b49ec8418f2908beec4af47f16b699f45"
