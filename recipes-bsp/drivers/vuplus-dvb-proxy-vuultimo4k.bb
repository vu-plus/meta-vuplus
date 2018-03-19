require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180315"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "7ed3c0359f939a3e84fcb11af299165e"
SRC_URI[sha256sum] = "6401a18215dbf67b5df007e48e59dd7643f5557cb943eafb7b2e1f0c1708a414"
