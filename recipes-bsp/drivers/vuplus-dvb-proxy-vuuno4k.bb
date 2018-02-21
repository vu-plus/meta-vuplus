require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180220"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "4b091715f1bfd07c53796a7324fe5a6d"
SRC_URI[sha256sum] = "b8cf7b28bca24bed51b52da727ae6f7c04cdd65508ef3ba034963f649793b389"
