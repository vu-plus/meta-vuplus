require vuplus-dvb-proxy.inc

COMPATIBLE_MACHINE = "^(vuduo2)$"

SRCDATE = "20171128"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7424.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "47392629f063e9c7d295b0763b3cefb6"
SRC_URI[sha256sum] = "798c77122cc98704336a59d4fb7ae19b7a42f61268194c8d6d9632566f6838e9"
