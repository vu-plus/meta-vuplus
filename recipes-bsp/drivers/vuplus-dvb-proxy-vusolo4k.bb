require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20160602"
SRCDATE_PR = "r1"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "e4f354d01ecf0cb5d61c1007a48dfbcf"
SRC_URI[sha256sum] = "3a225649671d7dcfb53629074932084af94802dcbe6e6ced87a71bf05656a180"
