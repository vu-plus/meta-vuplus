require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171129"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "c5f466b85568254d9bcfc286c0c4c710"
SRC_URI[sha256sum] = "de9b6dda1044a314f249895298dc2a51e86579b934ae9203e152721631c29821"
