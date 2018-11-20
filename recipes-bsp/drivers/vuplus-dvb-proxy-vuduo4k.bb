require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181120"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ccdc58b5a317b7230e0c72c24f77a51a"
SRC_URI[sha256sum] = "8f3fce0687e516e7be426efd1812ee9de8b4c91db44d2ad784fc9b01b6a9ed59"
