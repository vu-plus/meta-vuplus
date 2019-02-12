require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20190130"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "5ed38f49522f9498ad1ba820931c945d"
SRC_URI[sha256sum] = "aa282aac0d2aaf73a3a42c6bee254a2b101da8898dab29972b25c4638a06d2ef"
