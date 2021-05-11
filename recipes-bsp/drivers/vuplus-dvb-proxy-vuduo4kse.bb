require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20210407"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "dc8571a0155759691e9d2e61a6696880"
SRC_URI[sha256sum] = "4cef80114867ab41ee0b095241edbe5e54d3b3a2663af9481daaf2668985ed3d"
