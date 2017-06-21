require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170522"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "3f5f60dac901dbd06874fa60225d6c7c"
SRC_URI[sha256sum] = "de40432d5ebfd4e82d88039165df4833b7bf4a78cda2edeca5b9db31b69762e4"
