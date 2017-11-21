require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171120"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "936325a6e8fbe5e43d2acc71338dfcfc"
SRC_URI[sha256sum] = "7e5e33a33fcac8e9b25d3f130d7b6a964f12287a0ac657611d7b5d6ab4c150be"
