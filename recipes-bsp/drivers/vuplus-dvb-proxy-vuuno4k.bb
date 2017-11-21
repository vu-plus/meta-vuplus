require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171120"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "e7462528111b0666bbce5705846cf81e"
SRC_URI[sha256sum] = "bcc7b5339b7475129008ca45646c86aa95607d96f2f6d886eb11976f6872ba06"
