require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20191125"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "4981cd99c5d5b028189156cb6ad20bcb"
SRC_URI[sha256sum] = "3ef828137d6235b2f7c52e917d14abdd4f4113355f846ed9838474478f46b66f"
