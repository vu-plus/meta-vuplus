require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuduo2)$"

SRCDATE = "20170822"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "fc6995531e18c7f31b5a4d7de376161e"
SRC_URI[sha256sum] = "2dbe00127103771ff0ba306fa2f8f72ef048da542d69aafe6553e9c0b5c7e7e4"
