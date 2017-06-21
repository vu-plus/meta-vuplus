require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170522"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "36efcb927f4e76cafde83de08ad6ded3"
SRC_URI[sha256sum] = "827bf3be0790d2e546a60e441bfd5da34d42523bc7eeadd461a3e82756f38213"
