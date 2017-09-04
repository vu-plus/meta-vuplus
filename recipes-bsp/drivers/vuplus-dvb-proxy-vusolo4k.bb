require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170831"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7376.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "b41d1d465398374d6688b35e39ee0e35"
SRC_URI[sha256sum] = "a3e544f4a8110b3cb28481d14a32709ff9dbda948bce033334c1164f9b0bf985"
