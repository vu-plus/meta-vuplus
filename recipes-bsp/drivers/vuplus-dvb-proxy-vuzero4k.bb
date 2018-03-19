require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180315"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "283b0e9eb363888fea79ceaf22e2af7e"
SRC_URI[sha256sum] = "f39c66a548e9659b781aee8b3b54c4333a52e5b3e6b20cc416cbba1985b35ad4"
