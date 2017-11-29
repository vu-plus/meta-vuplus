require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171124"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "477d583bff00285b0f752a5fd73ce9ef"
SRC_URI[sha256sum] = "29114d8c9faa0dac47d5bf9b2081a5bc308ee960a86dd070c38b9718395ead69"
