require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181115"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "aed454816f78f576827e548006e60bde"
SRC_URI[sha256sum] = "5107f4eedb6daa121897380cc4190d70f774d34447f135153204b96ed6d7cb26"
