require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180702"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "3fa5eb2617284efe7f2acff03479ecd5"
SRC_URI[sha256sum] = "e8e788731c0e806f356a571d88bc81d3269db0b442555ad8242672a02093ebad"
