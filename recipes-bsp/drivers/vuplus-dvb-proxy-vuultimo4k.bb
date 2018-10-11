require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20181005"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ffa8d9c98f724b5d79bbeba1ed8f6ed3"
SRC_URI[sha256sum] = "4d1615467adb3dd36086f713d04823c45b34daa4278ebab6c097c0bff22df806"
