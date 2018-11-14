require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181113"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "2179d657f6e628efc4c13b4f23eab317"
SRC_URI[sha256sum] = "0ea477ab605369b493dfc47e314069831e80cca3e993feea7a8b6408f1bf8d36"
