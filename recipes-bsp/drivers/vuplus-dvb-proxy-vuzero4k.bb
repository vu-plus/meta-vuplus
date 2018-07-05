require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180702"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ed9e33c3c07ce3476a77dc45f4ff24de"
SRC_URI[sha256sum] = "7888911a4504db38b056c172c5f2ec68db99a2dc1911aa27e3a1601687354a5a"
