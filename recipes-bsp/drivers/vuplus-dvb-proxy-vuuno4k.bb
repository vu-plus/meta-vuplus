require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171129"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "3e71192727ee174a63e181d1e373905e"
SRC_URI[sha256sum] = "30fe14514d48e11a71386a0bd418d689d3b8a89070b28e3d5cca6e8bbb9d266a"
