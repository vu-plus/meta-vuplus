require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171124"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "0bec342a83ac0d98af2550ff4b1d599c"
SRC_URI[sha256sum] = "600e72689663193e834ce22497f13957f6fc32d7ca39b50489e3db6072b0bea6"
