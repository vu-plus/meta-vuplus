require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180208"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "f7fa67188bd10bec321c3222af2e2499"
SRC_URI[sha256sum] = "2b232484ab68ce545066c60aa1a9b30b93912506e5ae14b96ddcdd5e79667593"
