require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180424"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "7614c4f0c720db557d527f8a24cc0e24"
SRC_URI[sha256sum] = "16aaa924877955d00df6ea10f265d0c4e655ca2ca969674295d3676b2a98314e"
