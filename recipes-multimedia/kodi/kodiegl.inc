SECTION = "base"
LICENSE = "CLOSED"

PR = "${PKGDATE}"

PROVIDES = "libKodiGLESPL.so"
RPROVIDES_${PN} = "libKodiGLESPL.so"

SRC_URI = "http://archive.vuplus.com/download/build_support/kodi/KodiGLESPL_${MACHINE}_${PKGDATE}.tar.gz"

S = "${WORKDIR}/KodiGLESPL_${MACHINE}"

do_install() {
	install -d ${D}/usr/bin
	install -m 0755 ${S}/bin/* ${D}/usr/bin

	install -d ${D}${libdir}
	install -m 0755 ${S}/lib/*.so ${D}${libdir}

	install -d ${D}/usr/include
	install -m 0755 ${S}/include/*.h ${D}/usr/include
}

do_package_qa() {
}

INSANE_SKIP_${PN} += "already-stripped"
INHIBIT_PACKAGE_STRIP = "1"

FILES_${PN}="${libdir} ${bindir}"
FILES_${PN}-dev = "${includedir}"

PACKAGE_ARCH = "${MACHINE}"

