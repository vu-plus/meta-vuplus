require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180319"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "44730b6b3af607c18838c536ee567e61"
SRC_URI[sha256sum] = "1309a268bf9f301e0e1df47cd70941c0adde32441ffe182db6676a4a5c444029"
