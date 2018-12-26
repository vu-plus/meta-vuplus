require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181213"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "39db12d5a35b71f5796560dd10f29ba2"
SRC_URI[sha256sum] = "ba96a73c796ac0299d27a71f30deabbaae16fb79c770d0e2389636c165926988"
