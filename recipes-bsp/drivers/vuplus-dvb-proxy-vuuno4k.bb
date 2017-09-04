require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170831"
SRCDATE_PR = "r5"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "f3b0543ab46810fca42b6dd305493b11"
SRC_URI[sha256sum] = "a40a8f5e54071ca2ee79d320bf71a9ce63bbeb4ff890f0a83a4c68b17906d5c9"
