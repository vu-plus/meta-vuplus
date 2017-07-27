require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170629"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "2ff9232dd14fe94f32c192b926662c3b"
SRC_URI[sha256sum] = "0200128d40f1b87bcab5c910cf8d1098de42926698f63f948c3d9ef75f72e7b3"
