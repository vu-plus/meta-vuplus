require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181220"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "c091d50d790e87986935a90519e34531"
SRC_URI[sha256sum] = "02cffcb0ad2fc24b90105fae8216df9709c5accffdf27d9ab824e398d00b6a4c"
