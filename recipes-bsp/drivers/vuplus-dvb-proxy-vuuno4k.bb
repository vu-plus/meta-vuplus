require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180209"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "6f3784e09f06dcebc4090edd0f103d03"
SRC_URI[sha256sum] = "2c6c78ab3dec0c59e4915324334027d28e97a9f24b82c46d098dd51e3754afd9"
