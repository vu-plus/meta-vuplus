require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180315"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b0fbe12d9e1dfceb593ca7a32f4dfb0b"
SRC_URI[sha256sum] = "f9c4693072ef9c8d162d647a992ee9a1ba62fa9e726760d68cc6fd6e1ec074dd"
