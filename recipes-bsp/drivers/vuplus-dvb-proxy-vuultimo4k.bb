require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20181204"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "8108ac27c64275cf8d231c5dc846b62b"
SRC_URI[sha256sum] = "09b8a4a2484c5d04815f78b3313f03d6022ef6a95bedfb74a4b1b7b09d9d64a7"
