require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171030"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "106f40699b19b7caccf1f8e8a7c9c4e6"
SRC_URI[sha256sum] = "965b74035f78498480c48794e949e19c0b669dd50c25dd0938e79de2bd2ac5bb"
