require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180730"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "73e1bfb7d54a45747a1bab85f4ddfbe5"
SRC_URI[sha256sum] = "7fc0e8c7d608dce9abc8d4115134c3c71d1a3aebbb4b7ad0d650689ec9c70fba"
