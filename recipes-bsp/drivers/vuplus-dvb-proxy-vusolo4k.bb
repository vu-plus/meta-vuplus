require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20151202"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "f1e57feedbb6d5410b72de072ae574a6"
SRC_URI[sha256sum] = "1659b7a793e7496a1830165063dc94cb0c3f4c40c6e9c340639aa296c2ac0e7e"
