require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171219"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "8c49ad146855f7f33c855edf74757df1"
SRC_URI[sha256sum] = "c0a437b0328792597757e6835da32795acee83b2b099a2fe593220a0544bf411"
