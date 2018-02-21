require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180208"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "782d735f498723b7186f66a641d4e982"
SRC_URI[sha256sum] = "62067fba4eb0737cad6cdf32cbd8999f40b730a9bbe23c3ac8b3dd5915ceb055"
