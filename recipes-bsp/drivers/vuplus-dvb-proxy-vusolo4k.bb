require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180406"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "9ba622965fad5526bda7143845c93887"
SRC_URI[sha256sum] = "f8efa053b1dbf20b3c2b33fbe7f00e532faf1580018f45ccccf7964bbb5ad036"
