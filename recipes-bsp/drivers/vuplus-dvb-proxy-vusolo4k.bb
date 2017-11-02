require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171101"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "5f4b80d1531d44af0d47d7d725d2fb62"
SRC_URI[sha256sum] = "94f805df12c382c1c165c886e0f28de77f40b84ff18271572bc51989532921d0"
