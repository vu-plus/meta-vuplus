require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180208"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "e7664dcbfaf323b712d292fd1dd108f8"
SRC_URI[sha256sum] = "3915751e7608fa02332cc6e78f899fd1b9a3889e4b9cba35cfa22363940abd16"
