require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20160119"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "a170f92279aecb7028a6ef057417ff19"
SRC_URI[sha256sum] = "77e5233ef156eb08a536689ce1026884240fbff97985ef225fc6236b22a73059"
