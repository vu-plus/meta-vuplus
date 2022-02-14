DESCRIPTION = "Chromium and YoutubeTV"
SECTION = "base"
PRIORITY = "required"
LICENSE = "CLOSED"

PV = "1.2"
PR = "${SRCDATE}"
SRC_URI = "http://code.vuplus.com/download/chromium/chromium-vuplus_${MACHINE}_${SRCDATE}.tar.gz"

# Added to support the OE-Alliance.
#PREFERRED_VERSION_nss = "3.17.3"

#DEPENDS = "nss libxslt"
RDEPENDS_${PN} = "libcrypto-compat nspr nss libxslt libudev libcurl"

do_install() {
	install -d ${D}/usr/local/chromium
	cp -afR ${WORKDIR}/chromium/* ${D}/usr/local/chromium/
	chmod 755 ${D}/usr/local/chromium/run.sh
	chmod 755 ${D}/usr/local/chromium/bin/browser_shell
	chmod 755 ${D}/usr/local/chromium/bin/chrome
	chmod 755 ${D}/usr/local/chromium/bin/chrome-sandbox
	chmod 755 ${D}/usr/local/chromium/bin/goexit
	# patch chrome for libudev.so.1
	sed -i 's/libudev.so.0/libudev.so.1/g' ${D}/usr/local/chromium/bin/chrome
	sed -i 's/libudev.so.0/libudev.so.1/g' ${D}/usr/local/chromium/bin/browser_shell
}

do_package_qa() {
}

#PROVIDES += "chromium-browser"
#RPROVIDES_${PN} += "chromium-browser"

PACKAGE_ARCH = "${MACHINE_ARCH}"

FILES_${PN} = "/"

INHIBIT_PACKAGE_STRIP = "1"

