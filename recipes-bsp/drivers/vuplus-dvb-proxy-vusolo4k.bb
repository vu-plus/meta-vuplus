require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180212"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "a1ced4042ae97ec9a3d9c9e164bf0f84"
SRC_URI[sha256sum] = "b6056f28abe90af9ea607d2d4ea2de6a252ce3513c1f55971f8db6c3ada3fbbd"
