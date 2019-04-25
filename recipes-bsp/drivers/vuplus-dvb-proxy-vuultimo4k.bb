require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20190424"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "069625b25bda95a32b19f4a1b40d17a4"
SRC_URI[sha256sum] = "a36955f7c4284da98a5f689b47513d8c16572a0d6987a5f9bb0131cb895bf12f"
