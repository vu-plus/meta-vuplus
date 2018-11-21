require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181121"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "c14557554644f83de973f9b3cb2b9422"
SRC_URI[sha256sum] = "4e5a7f64b8492c071f576a1d618502055ffbe74b3e7dcf84d4ab0b4daf8d4746"
