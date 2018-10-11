require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20181005"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252sse.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "1556756b66f3efae44b8746173e55cdc"
SRC_URI[sha256sum] = "a069db6a74a8ec20b0be3077cc8f3759a65e43b56e12a5b68de5f2d7da081b9f"
