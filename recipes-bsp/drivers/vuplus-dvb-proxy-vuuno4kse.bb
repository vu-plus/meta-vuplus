require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180315"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "4babccb0bee9731daebd4f23882c6ba4"
SRC_URI[sha256sum] = "983b34091c8c4a9795eab76fb04fba4d6050e2967d3da0d6c523f45ca884b2af"
