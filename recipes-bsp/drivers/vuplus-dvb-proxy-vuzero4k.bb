require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180424"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "065b839a76bec3e2b2e7b82a8feaf7ed"
SRC_URI[sha256sum] = "9123e3400c3755fa26166309a4d6d855ed4871eddad5822162724ed8ebb90629"
