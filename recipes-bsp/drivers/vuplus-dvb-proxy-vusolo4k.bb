require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180220"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "253938b11624eb510e1a334c3d248580"
SRC_URI[sha256sum] = "0b2b029a66b247f9058deec2554f6d81176142f72eced2b6d4e3eff649c69098"
