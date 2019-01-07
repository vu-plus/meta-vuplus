require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20190104"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b445e831ef907b3e67b04a700fee5290"
SRC_URI[sha256sum] = "22f291947f3ab7dac15007b87a6d0a5231f2c591f46ae49bac6629cc940b132a"
