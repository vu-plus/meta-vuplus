require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20190107"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "fdb4f763df32a31b758178c7d87379c2"
SRC_URI[sha256sum] = "db4b28f682b9c9d4963e5a6f78761645a492a9c5333a07ce37844de1c10b071e"
