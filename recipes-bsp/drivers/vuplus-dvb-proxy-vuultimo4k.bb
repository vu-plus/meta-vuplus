require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170831"
SRCDATE_PR = "r5"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "02dc23c939ef9e37b715a66067ec7208"
SRC_URI[sha256sum] = "971a74ffbee3d4e9e0a9887bbe536d40a75157006e9a85b475c42f0ae370ae3a"
