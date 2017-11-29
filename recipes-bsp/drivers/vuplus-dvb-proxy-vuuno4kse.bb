require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20171129"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "5a433336dfc04909e60ee7cbdd98c003"
SRC_URI[sha256sum] = "b3bb7d9227fb9591da702ae6ef9ed1dc4f8e4b8855ed48fe94899247f8e0c31d"
