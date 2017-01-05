require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20161223"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "83c309ca6c8f48d517220ba9f25be7a2"
SRC_URI[sha256sum] = "91f75266a491b6cb37a1ff5800eed1be6ed03e3d637a32eec0f3ecde2881a165"
