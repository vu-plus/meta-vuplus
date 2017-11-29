require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171124"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "76fdc5b6d15c3143b7452453d31edf68"
SRC_URI[sha256sum] = "248a4db5a262e54a3384f3847b0272b97412389eaa0af6ad7527390ee95cae36"
