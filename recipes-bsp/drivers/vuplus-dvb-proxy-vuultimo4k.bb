require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170220"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "0417704119c13a0f1c1a15f176ad8760"
SRC_URI[sha256sum] = "ccaafe3abe85f8b0ffdb55db9b57cc42c8c055a7ad76b4b9a51785eb7c0ae168"
