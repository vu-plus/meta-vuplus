require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170821"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "78adea85f9536b0e5cc935dbc0f7b295"
SRC_URI[sha256sum] = "cca6f3b1a501760a74e6f7a085043fb33525d2d5ff5e65e2221621779d8e6531"
