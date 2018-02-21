require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180208"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b125cb5e43314ba7e9577d8cd8ca7b43"
SRC_URI[sha256sum] = "1bae3c26e338f3bc9446ff9e7f381e0645457ee98a5e13b5ca1396fa43bd2fea"
