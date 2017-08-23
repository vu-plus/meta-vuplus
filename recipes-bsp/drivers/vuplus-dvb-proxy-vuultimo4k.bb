require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170821"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "a61d7e04886bb312f8e397c7724117c6"
SRC_URI[sha256sum] = "b14bf2cb96c6e80d3b6e9326aac38d5b056d0a0e031d8adc638f67dd128438d2"
