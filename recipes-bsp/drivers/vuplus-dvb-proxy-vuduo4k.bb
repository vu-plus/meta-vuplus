require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181130"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "091011cc0a67addcf687b37f4dd487bf"
SRC_URI[sha256sum] = "7ae3e70e4605ed3152a37821ea61e2bcc6bdabd643aa2512c6e215db8ba618ac"
