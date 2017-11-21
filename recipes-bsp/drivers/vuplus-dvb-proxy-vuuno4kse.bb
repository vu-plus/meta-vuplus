require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20171120"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "bfed2d605f52302672625626e9c11b81"
SRC_URI[sha256sum] = "ff2196833d0095d4305d80e91422392911322351e323e6e8a332c77b39c8dce3"
