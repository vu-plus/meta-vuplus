require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180223"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "95e6908a132189a1013d0eda4c28b7dc"
SRC_URI[sha256sum] = "123683b1f5cf9655eb29ba0a5447ded4deb99a5f09fa140c03b842de97cbde05"
