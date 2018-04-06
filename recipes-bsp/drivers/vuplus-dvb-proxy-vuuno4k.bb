require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180406"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "487febdf869a9c6a017680ea71e64de6"
SRC_URI[sha256sum] = "f2fbfb8c43d4c5ba48f80fec051fdb4edf93db87e574326abc5c2d77da6ab2b8"
