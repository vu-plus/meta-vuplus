require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180209"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b5d260940795f2e5307e80fced9a8fb9"
SRC_URI[sha256sum] = "8786f5c7741fcc5a202bdb57eb338837765338dc006229c90f7dddf5e07e49c8"
