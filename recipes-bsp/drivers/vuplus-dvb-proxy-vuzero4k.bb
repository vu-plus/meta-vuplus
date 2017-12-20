require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20171219"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b0125edf39b4dfbcf7d2981e19a3f976"
SRC_URI[sha256sum] = "d73abebe78f1678ad1a1759c75341842ec14bee6534de537ae7a22dd938ef126"
