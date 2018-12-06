require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20181204"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "8b197a421b473b8c8fcc991daee9312c"
SRC_URI[sha256sum] = "0b9c5d28fde3d5cd842235032a84908a23472596d7599318cf10897aa73cf3a6"
