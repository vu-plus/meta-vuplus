require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181205"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ed97051babd4be5c719f06f64e37836c"
SRC_URI[sha256sum] = "55ae69a957010cdcc944892f7fec7874b53b88eebf3988df7dce48fcae3833c0"
