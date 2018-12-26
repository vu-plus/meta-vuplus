require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20181226"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "2fe455e1cfb9d9e8539a5e42416b8ab1"
SRC_URI[sha256sum] = "0c2d659bf786859ae88d45cfd70472486b48caea24dfde5f1da1dc7bb9d58df6"
