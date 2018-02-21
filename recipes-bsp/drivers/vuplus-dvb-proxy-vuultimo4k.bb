require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180220"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "e995ea851dcf276f8fa8d20a21936970"
SRC_URI[sha256sum] = "ae66327c1e85e57a68bf64219b648d63a2808694939e310707d3f22c10f539ac"
