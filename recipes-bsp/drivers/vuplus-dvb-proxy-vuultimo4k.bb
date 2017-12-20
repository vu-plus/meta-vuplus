require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20171219"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7444.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "ce7f62d0c83ed8fd1d7b1ea2a6e7e905"
SRC_URI[sha256sum] = "c069be89cfd7e981ec695c093d1f3a975e07cebf5fa93d9022ff4b45c07d7e68"
