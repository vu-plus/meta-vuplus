require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20190424"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "951575c71b27680b194423e279417722"
SRC_URI[sha256sum] = "6937097570f3f091d358cafe14e41e12890807c5b1bab51429563b49070436ab"
