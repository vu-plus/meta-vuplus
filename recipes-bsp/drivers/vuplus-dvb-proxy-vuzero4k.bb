require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20171128"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "f9bae1ec5ecc62e13aeee3ab93fef404"
SRC_URI[sha256sum] = "5dd482cb65547f76a0295ed45721bfc248858a8009b7f0aabdebf4a2fded44b8"
