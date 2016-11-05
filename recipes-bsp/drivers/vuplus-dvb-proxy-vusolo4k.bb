require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20160808"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "11c358ddee3e04b3454a707aaf80926a"
SRC_URI[sha256sum] = "e6d3183f85950e20b7e97205550580f80c4516672c1f5ca3ab32518e7767db0c"
