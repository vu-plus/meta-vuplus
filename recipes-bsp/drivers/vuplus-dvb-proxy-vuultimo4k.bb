require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20180226"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "7f84b748f885fa11231d5fca5a2029d7"
SRC_URI[sha256sum] = "611c652e480b086cea74963f12019a760174c3beafcb6e1ece5fb50a487cfe01"
