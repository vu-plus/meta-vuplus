require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181128"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "f6ef1efe353df17e29b3e7e98b8e63b5"
SRC_URI[sha256sum] = "c16a1f86ef4f934728c39bf0f51d8dfbd8818c6ff9c469304d1ec22ed6dce1c5"
