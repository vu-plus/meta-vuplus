require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170622"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "98a4426de3eeb11163f6ab3d3f3d3860"
SRC_URI[sha256sum] = "0d7ee180861f46c7f4b84ddb77c66168d96ca8f0e2de6e4472657898d24e5458"
