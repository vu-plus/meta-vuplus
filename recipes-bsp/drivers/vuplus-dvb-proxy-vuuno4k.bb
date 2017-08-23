require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170821"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "0537d2e77af32ed144cda7a8dd889b04"
SRC_URI[sha256sum] = "e61ac0fa25ef1b01385c423b29416d7747b079cf16c74b6d9244698e8d3c41d7"
