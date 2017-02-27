require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170218"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "fd2f5342b1ead998d453d6efff4e5d84"
SRC_URI[sha256sum] = "c58906e9e07b8581bbdd5a6a3035931531f9cff1a60706a48facaff60b64b49e"
