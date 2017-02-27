require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170217"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ce309fcb0de5194227d8c1e572f5b187"
SRC_URI[sha256sum] = "59bda7962442fa6b2822dab784bc7946c5af35468cef6b3e132e412c14a952f7"
