require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180702"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "176da7e2947c44090216de45acfe2d71"
SRC_URI[sha256sum] = "329261e524c58017ea37f2eb5ee498fd2cfc646d505562c94c171c04e1eada6f"
