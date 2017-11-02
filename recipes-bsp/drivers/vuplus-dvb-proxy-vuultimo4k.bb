require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171101"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "582a191df0f71dbce7396e534493b7e0"
SRC_URI[sha256sum] = "b248fbd5e9e4d22a61c64bfb79371294421200a0844a461f1f4902a1c1560e46"
