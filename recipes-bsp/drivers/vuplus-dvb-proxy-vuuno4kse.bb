require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180220"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "83c839f0986b0d28a492ffaf3608d7c6"
SRC_URI[sha256sum] = "5d29ce5a42a8551327f8e7d5157265ffca09cbd50da81861ee3b35a9ceeba464"
