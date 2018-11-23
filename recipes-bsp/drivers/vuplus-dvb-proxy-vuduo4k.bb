require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181121"
SRCDATE_PR = "r4"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "cfb39f1d9d41bb904700170ef1073fc6"
SRC_URI[sha256sum] = "8f610777e3f3dc84c22b9f3641bdd244ad61c46ba4ebdf4960339a5fd8d8d048"
