require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171122"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "9963ce419476ffd4b3397265aeb6e08e"
SRC_URI[sha256sum] = "586072975fb92d7aaac34915e6283d6efc415e3ae7480064969fb1de7af6200f"
