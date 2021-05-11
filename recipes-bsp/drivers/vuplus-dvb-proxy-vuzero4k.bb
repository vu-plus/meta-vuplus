require vuplus-dvb-proxy.inc

KV = "4.1.20"

SRCDATE = "20210407"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm72604.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "1216dec6517fcb9e14b95520bd1f762a"
SRC_URI[sha256sum] = "c364dc935be38f9f961b61b6d48a44c9ed04197f76bdc48d15b9bae4ee2e1259"
