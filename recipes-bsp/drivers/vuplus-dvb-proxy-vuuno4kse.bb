require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180226"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "7d6e176c905f3fa2369cce996dfd6af0"
SRC_URI[sha256sum] = "23536c64ae9746d60b95f3ea3cffbafbf8479fadb442b70b1a89444f70eecb17"
