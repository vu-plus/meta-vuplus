require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20181204"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "9997dbe364b4b06f5abe07ced55455d0"
SRC_URI[sha256sum] = "0e4dd341a0228c2a6e300dbfe949b2e0c067b20e8cca8cdc4b2a72241398c418"
