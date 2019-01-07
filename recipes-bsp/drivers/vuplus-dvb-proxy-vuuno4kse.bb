require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20190104"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "1521c66ae54cf9a3703f5b75b54ceba2"
SRC_URI[sha256sum] = "38e977bd0036c4d9799e13ba00030f6d7c1d521cc5ed9e9af221b3adc46bd328"
