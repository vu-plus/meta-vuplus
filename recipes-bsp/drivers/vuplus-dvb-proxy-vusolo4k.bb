require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180411"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "82fec877cafa60e36b930bb9d064a096"
SRC_URI[sha256sum] = "9187839271d24ac7922af9d63b174d5f9a4bd2b666c95651c4888727db91a911"
