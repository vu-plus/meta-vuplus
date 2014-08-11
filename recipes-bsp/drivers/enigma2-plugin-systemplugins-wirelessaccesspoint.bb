inherit gitpkgv

SRC_DATE	 = "20140721_p0"
DESCRIPTION	 = "VU+ Wireless AP plugin"
LICENSE		 = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c9e255efa454e0155c1fd758df7dcaf3"
SRCREV		 = "edc5039d1369587598a74568b3e1de0039487a6c"
PV		 = "experimental-git${SRCPV}"
PKGV		 = "experimental-git${GITPKGV}"
PR		 = "${SRC_DATE}_r0"
BRANCH		 = "vuplus_experimental"
DEPENDS		 = "hostapd bridge-utils rt3070 firmware-rt3070"
PROVIDES	 = "enigma2-plugin-systemplugins-wirelessaccesspoint"
RDEPENDS_${PN}	 = "hostapd bridge-utils rt3070 firmware-rt3070 kernel-module-bridge"
FILES_${PN}	 = "/usr/lib/enigma2/python/Plugins/SystemPlugins/WirelessAccessPoint/*"
PACKAGES	 = "${PN}"
PACKAGE_ARCH	 = "${MACHINE_ARCH}"

SRC_URI = "git://code.vuplus.com/git/dvbapp.git;protocol=http;branch=${BRANCH};tag=${SRCREV}"

S = "${WORKDIR}/git"

do_install() {
	install -d  ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/WirelessAccessPoint 
	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/WirelessAccessPoint/*.py ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/WirelessAccessPoint
	install -m 0644 ${S}/lib/python/Plugins/SystemPlugins/WirelessAccessPoint/*.orig ${D}/usr/lib/enigma2/python/Plugins/SystemPlugins/WirelessAccessPoint
	python -O -m compileall ${D}/usr/lib/enigma2/python/Plugins/
}

pkg_preinst_${PN} () {
#!/bin/sh
if [ -f "/etc/hostapd.conf" ]
then 
	echo "backup /etc/hostapd.conf to /etc/hostapd_default.conf"
	mv /etc/hostapd.conf /etc/hostapd_default.conf
fi
}

pkg_postrm_${PN} () {
#!/bin/sh
if [ -f "/etc/hostapd_default.conf" ]
then 
	echo "relocate /etc/hostapd_default.conf to /etc/hostapd.conf"
	mv /etc/hostapd_default.conf /etc/hostapd.conf
fi
}

