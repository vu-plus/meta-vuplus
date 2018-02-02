require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180202"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b8d65848b9b1ff700a5a62487817cb8b"
SRC_URI[sha256sum] = "961abb1060d0b8810755d5843d97c685d0ab7b1fc82ca37cd3bf969fa441d297"
