require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20210407"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "1f174b6801e3a394137004de05f0ae61"
SRC_URI[sha256sum] = "939b1085a2c8833a6a83798bbff03bd46209fae34f103a1bb56f7109037a3bcf"
