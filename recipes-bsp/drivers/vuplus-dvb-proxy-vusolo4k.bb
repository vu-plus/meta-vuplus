require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170522"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "bc820d1070845180d7fa14a8828e1452"
SRC_URI[sha256sum] = "e010d968fdee212545e2bc3e0875f167ec99088e256341993551bcc261df4152"
