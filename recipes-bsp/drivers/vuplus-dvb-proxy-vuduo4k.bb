require vuplus-dvb-proxy.inc

KV = "4.1.45"

SRCDATE = "20190424"
SRCDATE_PR = "r0"

pkg_postinst_${PN}_append () {
	if [ ! -f $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko ]; then
		ln -s /lib/modules/${KERNEL_VERSION}/extra/dvb-bcm7278.ko $D/lib/modules/${KERNEL_VERSION}/extra/dvb-bcm.ko
	fi
}

SRC_URI[md5sum] = "32dd06fcc253d5f7bcbd0ce4a1e27248"
SRC_URI[sha256sum] = "2f0e423cd3b8c886d0dfe8b2fc643409415e7b5f37ba3ff5044c6e721c0e11bd"
