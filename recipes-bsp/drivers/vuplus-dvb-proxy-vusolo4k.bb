require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180223"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "103cb6dead3496b84f0f63364730e83f"
SRC_URI[sha256sum] = "d765599b63390c75d5ec63c4e4ba4a29b725f7647b2af7ac273cb2ada0b50868"
