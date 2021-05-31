require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20210527"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "baf03fd45fbddaaf46f878b72a1f4571"
SRC_URI[sha256sum] = "2fcfad875ab01639705deaeddb61221138dcfaee6caa50edf877ac1b790d8400"
