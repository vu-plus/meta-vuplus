require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180406"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "3d885615fe15d2f547f0f00190bb8611"
SRC_URI[sha256sum] = "932d8ace4d673e525b56b880d4bc7c799a8b26d3a93c11b34601bca19fb10d8b"
