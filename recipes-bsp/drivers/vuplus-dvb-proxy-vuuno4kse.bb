require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20171116"
SRCDATE_PR = "r1"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "adb06c69522d38b9bc7d8b05442ea687"
SRC_URI[sha256sum] = "6c5d3f025152e9ae398fc0bbd0b36c026bd1540fd359264d75fe7d32d3f3667a"
