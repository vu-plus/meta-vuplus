require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolo2)$"

SRCDATE = "20180220"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7356.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ec61650a4c59e19ca483d1fb2e6dd681"
SRC_URI[sha256sum] = "273b67fcafa8893bf829cb07f59668cfbc2b9fcd70bfefcece615f6ed4826ef2"
