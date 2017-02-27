require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20170218"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "606f77acc12206e2b59c5306a1692bb7"
SRC_URI[sha256sum] = "521409168574000e6e3cf6e5c04f3ffe2e9f10e33d88943942a179cd633f5f1f"
