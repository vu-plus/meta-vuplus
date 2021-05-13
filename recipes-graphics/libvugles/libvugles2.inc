SUMMARY = "shared library for E2 animation"
SECTION = "libs"
LICENSE = "CLOSED"
PACKAGE_ARCH = "${MACHINE_ARCH}"

DEPENDS_vuduo2 = "libgles-${MACHINE}"
DEPENDS_vusolo2 = "libgles-${MACHINE}"
DEPENDS_vusolose = "libgles-${MACHINE}"

RDEPENDS_${PN} = "libgles-${MACHINE}"

PV = "0.1.1"
PR = "${SRCDATE}.${SRCDATE_PR}"

SRC_URI = "http://code.vuplus.com/download/release/libvugles2/libvugles2-${PV}-${MACHINE}-${PR}.tar.gz"
SRC_URI_vuduo2 = "http://code.vuplus.com/download/release/libvugles2/libvugles2-${PV}-${PR}.tar.gz"
SRC_URI_vusolo2 = "http://code.vuplus.com/download/release/libvugles2/libvugles2-${PV}-${PR}.tar.gz"
SRC_URI_vusolose = "http://code.vuplus.com/download/release/libvugles2/libvugles2-${PV}-${PR}.tar.gz"

S = "${WORKDIR}/libvugles2-${PV}"

inherit pkgconfig

do_install() {
	install -d ${D}${includedir}
	cp -r ${S}/include/* ${D}${includedir}/
	install -d ${D}${libdir}
	cp -r ${S}/lib/*.so ${D}${libdir}/
	install -d ${D}${libdir}/pkgconfig
	cp -r ${S}/lib/pkgconfig/*.pc ${D}${libdir}/pkgconfig/
}

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""
