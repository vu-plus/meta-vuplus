require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180412"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "498c93af157fe3859ced60e32659cd94"
SRC_URI[sha256sum] = "43dc6419ba8b4297d0bbb551a2655ee861e3cb7142e081381f98935bff343bd7"
