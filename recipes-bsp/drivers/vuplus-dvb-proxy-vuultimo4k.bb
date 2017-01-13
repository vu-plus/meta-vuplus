require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170112"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "50a8951a724913517abf9bdfbbb79169"
SRC_URI[sha256sum] = "b08457b27a2809cd17ca8ed464340088d4cdc2c92035d40939520861eff56bb2"
