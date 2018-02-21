require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20180212"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "553b45e17a009a3eb5bf0b5e071a7c8b"
SRC_URI[sha256sum] = "37d47e44b5133e119d4533ae00f145e099cd0359ef53e5802cc7a195a7ecfb60"
