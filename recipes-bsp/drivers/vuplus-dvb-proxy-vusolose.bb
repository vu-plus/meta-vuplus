require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vusolose)$"

SRCDATE = "20180220"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7241.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "9045d1a6e64fe364d3d58d3d9de64bfb"
SRC_URI[sha256sum] = "0abae28fa092b64fc36c430ca5bde33f827930831427aec5f6f17cf79521b7f7"
