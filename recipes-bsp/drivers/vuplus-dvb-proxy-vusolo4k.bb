require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171030"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "94dc867e03fdfa04f9de91f00811e8f9"
SRC_URI[sha256sum] = "023d275d002929db820ddfac8c63ea4d4268084f89e39bc6ab76bc11183b6763"
