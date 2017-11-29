require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20171124"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "e3ad533a25a03eb4901cfb417aea9527"
SRC_URI[sha256sum] = "b8a7d2747bee859b3ef8b0f2a23ef6d6f7d039284cfab8ad4d3df4125e71175a"
