require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20161020"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "9668af560c1a290df693339d9fc32e12"
SRC_URI[sha256sum] = "a55744b7e9905723a18faf652b71a275de7237a8b8751849b878f783e0efb21a"
