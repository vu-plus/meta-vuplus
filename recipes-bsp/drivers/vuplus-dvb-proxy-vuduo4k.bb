require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20190212"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "7ae1b57d2d75111d58472a8ad94b8b0f"
SRC_URI[sha256sum] = "8405a322eacf2794f87c7575646076511a9d6d22616b893beca96413e21f0861"
