require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171101"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "5b965a88d0f47810bb379bc55aa28d5a"
SRC_URI[sha256sum] = "cddaeb955aac79222de13d71242b9d2f99d3eab0d06606cda259c803df31a1b0"
