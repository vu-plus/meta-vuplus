require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180424"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ec8c7528c094f04a30cfb6c976933ae8"
SRC_URI[sha256sum] = "ee48a3fbe41e6b52c0103d88f44928aed5cbf3ee2d7cec2f9e699c4100b725ba"
