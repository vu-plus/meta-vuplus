require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180209"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "bbecd5c2cc7759ce797ccc2daaba9a97"
SRC_URI[sha256sum] = "4bc2811e751d8446deb56d0d62f705c90d5ee0eae4590d22bae52eb75da9ae91"
