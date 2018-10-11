require vuplus-dvb-proxy.inc

KV = "3.14.28"

SRCDATE = "20181005"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7252s.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "95f419a898011018683aa8db0cb1f2eb"
SRC_URI[sha256sum] = "b7505abc4cf17e1161538452a8becb3f9f925f0921e0fe32f7a1d7cb1a4c2cfe"
