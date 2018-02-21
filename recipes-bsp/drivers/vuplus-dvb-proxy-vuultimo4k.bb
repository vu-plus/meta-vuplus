require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180209"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "395a56b0f4b6bc28e2417e8e7a9131ce"
SRC_URI[sha256sum] = "22655da74e9600b67df1b05d6edf50d083c5ace8df7e55f37a7629b826ac6076"
