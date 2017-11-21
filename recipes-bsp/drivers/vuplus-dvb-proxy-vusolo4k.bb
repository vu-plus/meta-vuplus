require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171120"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "a09218c3da1a7e3f5459ac812102c929"
SRC_URI[sha256sum] = "acf87bbeedbc516fedbacb293b4db3cb477aad56d92425c5083a132977005c0d"
