require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181204"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "64a2218a9b21ec43ef28db8309e24ec6"
SRC_URI[sha256sum] = "3065764aa2b687165271c359e1e42a99cebff0a3ef9e354d49044c4b32df076d"
