require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20161202"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "2a44cfb2797f2b2f62bc580cef8a60fa"
SRC_URI[sha256sum] = "5ec120deb9c238f23c4d023e4c6bdd801dd4b2f9859c032a984174ffcc4d872c"
