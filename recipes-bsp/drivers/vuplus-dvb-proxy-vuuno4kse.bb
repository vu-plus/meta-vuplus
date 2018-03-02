require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180223"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ff2d85c61c07426db35711c7f3124cdf"
SRC_URI[sha256sum] = "2167e86c6099c2bb29061bed9ca6b486b2d94609c986929358e13460e087a889"
