require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181116"
SRCDATE_PR = "r1"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "d4946a7f5fae6f9a0b95bd12191d4112"
SRC_URI[sha256sum] = "c77256a85cc7482c2a52b182178b683861da9a89d4dcbbf4ac29cb38d4521360"
