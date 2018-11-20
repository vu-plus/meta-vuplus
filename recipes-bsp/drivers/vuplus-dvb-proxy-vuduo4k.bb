require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181120"
SRCDATE_PR = "r1"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b18fb9f964eb2928d62e1afbc0089310"
SRC_URI[sha256sum] = "f4b674e353fa6d03245f07e26c6cae4ddf2e38b32ef8622f381361b13467f86a"
