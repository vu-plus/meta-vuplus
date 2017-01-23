require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170123"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "87eb84c94bb5c0f20288c4038d473bc4"
SRC_URI[sha256sum] = "db2ea89f2629b2b7397550755ec9012b90e3380ce6921f3f6e2ddeb2c5708fbc"
