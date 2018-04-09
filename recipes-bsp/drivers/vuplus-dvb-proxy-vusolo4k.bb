require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180409"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "6722272668b93055890b86e07a490b43"
SRC_URI[sha256sum] = "4f06064bd51a81c826bc651f0a9ff844da4b66ce1ce1b4384f725c43faf8e234"
