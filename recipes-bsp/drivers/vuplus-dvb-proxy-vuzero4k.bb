require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20171222"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "c4dfd74f8a3c4cedfc29d6da81a7d042"
SRC_URI[sha256sum] = "f40ff960b18783288c39ff9c720c1b235d49c185c7276990f86a8f30d7e10b4b"
