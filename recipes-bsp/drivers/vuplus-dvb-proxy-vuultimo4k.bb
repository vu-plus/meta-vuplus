require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180212"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "e80a722d5af6353e33f144be1d830adc"
SRC_URI[sha256sum] = "26abc881b16cf92f9c188e07ffb28c36e6f21fffb92982142cd555dcd601521f"
