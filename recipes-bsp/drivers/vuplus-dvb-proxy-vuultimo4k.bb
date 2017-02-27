require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170217"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "f3f8bb292cbff7625ef48ab9e8d7af4c"
SRC_URI[sha256sum] = "e8960049bf64583912b2f485d6c3de995e782c8c9f2fb7dd0a8a8c1a7640e7dd"
