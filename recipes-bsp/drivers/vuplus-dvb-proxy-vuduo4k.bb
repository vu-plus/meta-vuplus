require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181206"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "53d808533e1b07a02b58c4c857088a15"
SRC_URI[sha256sum] = "82c535fe3ffee3dd2c7b7b25ef296ace7ae0304f151ebe89fafc375bbe63aa52"
