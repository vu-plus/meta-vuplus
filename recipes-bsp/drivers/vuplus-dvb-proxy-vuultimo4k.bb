require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180228"
SRCDATE_PR = "r1"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "75496745ba442e905918137cdca45d8b"
SRC_URI[sha256sum] = "1700e6cbe75209038913e1ba7e28d85a3336699295cbf4f966cfd17202015cc2"
