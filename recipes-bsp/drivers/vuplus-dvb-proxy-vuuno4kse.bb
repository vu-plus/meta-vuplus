require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180702"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "8637690be655e2669ed0fd38ff4484be"
SRC_URI[sha256sum] = "1e52259a3709cc3a9a76b184eb14749c8fe72b2c9fe5271c2be961007d59a830"
