require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180702"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "236893250afe55b2a6d689a102b25b86"
SRC_URI[sha256sum] = "0f668b6b6e021c959f0707bf6a176d6bc66bc16072267aa432d39e3e4170fe56"
