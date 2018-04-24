require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180424"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "82566513d635d31c4a46852784200bcc"
SRC_URI[sha256sum] = "97a191986589c52f492593d2a5b072fb2d38b915137a289106e4ec4014da905a"
