require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20160516"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "378646105d90b42455f02d20ab54ede3"
SRC_URI[sha256sum] = "7664944ffb7fb45da9694cb20ddc10b023737ad4ff21a93617dc6fff89f321c2"
