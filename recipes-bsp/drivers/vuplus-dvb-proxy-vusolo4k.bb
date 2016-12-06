require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20161115"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b88d37d83a3940e210a00d13ea1334b0"
SRC_URI[sha256sum] = "c5b2e38fda01757dfa368cc46698aa3e060ed9a09b536637d6890345abe11e36"
