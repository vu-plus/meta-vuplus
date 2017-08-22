DESCRIPTION = "Webkit browser for HbbTV"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"
#require conf/license/license-close.inc

PV = "1.1"
PR = "${SRCDATE}"
SRC_URI = "http://archive.vuplus.com/download/build_support/webkit-hbbtv-browser_${MACHINE}_${SRCDATE}.tar.gz"

RDEPENDS_${PN} = "webkit-gtk libudev"

do_install_append() {
	install -d ${D}/usr/bin
	install -d ${D}/usr/lib/mozilla/plugins
	install -d ${D}/home/root

	install -m 0755 ${WORKDIR}/webkit-hbbtv-browser/none.html ${D}/home/root
	install -m 0755 ${WORKDIR}/webkit-hbbtv-browser/browser ${D}/usr/bin
	install -m 0755 ${WORKDIR}/webkit-hbbtv-browser/libhbbtvplugin.so ${D}/usr/lib/mozilla/plugins/

	# patch browser for libudev.so.1
	sed -i 's/libudev.so.0/libudev.so.1/g' ${D}/usr/bin/browser
}

do_package_qa() {
}

#pkg_postinst_${PN} () {
#	if [ -z "$D" ]; then
#		if [ ! -f /lib/libudev.so.0 ]; then
#			ln -s /lib/libudev.so.1 /lib/libudev.so.0
#		fi
#	fi
#}

PROVIDES += "webkit-hbbtv-browser"
RPROVIDES_${PN} += "webkit-hbbtv-browser"

PACKAGE_ARCH := "${MACHINE_ARCH}"

FILES_${PN} = "/"

INSANE_SKIP_${PN} += "already-stripped"
