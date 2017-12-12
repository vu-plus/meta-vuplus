require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171204"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "d6c5370c17ebc3485f57b6be2ca1038a"
SRC_URI[sha256sum] = "814512e3043ff2af6626b4aca4fe727e4aee6dddf6540ef007ea961c6dc2f670"
