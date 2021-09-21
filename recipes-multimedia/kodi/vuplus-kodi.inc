DESCRIPTION = "Vuplus xbmc support"
SECTION = "base"
LICENSE = "CLOSED"

PR = "${PKGDATE}"
PR_mipsarch = "${GLPR}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS_${PN} = "libgles-${MACHINE}"

RPROVIDES_${PN} = "libKodiGLESPL.so"
RPROVIDES_${PN}_mipsarch = "libxbmc_base.so"

SRC_URI = "http://code.vuplus.com/download/release/kodi/KodiGLESPL_${MACHINE}_${PKGDATE}.tar.gz"
S = "${WORKDIR}/KodiGLESPL_${MACHINE}"

SRC_URI_mipsarch = "http://code.vuplus.com/download/release/kodi/xbmc-support_${MACHINE}_${GLPR}.tar.gz"
S_mipsarch = "${WORKDIR}/xbmc-support"

do_install_prepend(){
    install -d ${D}${libdir}
    install -d ${D}${bindir}
    install -d ${D}${includedir}
}

do_install(){
    install -m 0755 ${S}/bin/xbmc.helper ${D}${bindir}
    install -m 0755 ${S}/lib/libKodiGLESPL.so ${D}${libdir}
    install -m 0644 ${S}/include/KodiGLESPL.h ${D}${includedir}
}

do_install_mipsarch(){
    install -m 0755 ${S}/xbmc.helper ${D}${bindir}
    install -m 0755 ${S}/libxbmc_base.so ${D}${libdir}
    install -m 0644 ${S}/gles_init.a ${D}${libdir}/gles_init.a
    ln -sf gles_init.a ${D}${libdir}/libgles_init.a
    install -m 0644 ${S}/gles_init.h ${D}${includedir}
}

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_SYSROOT_STRIP = "1"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

# No GNU_HASH in libKodiGLESPL.so
INSANE_SKIP_${PN}_arm = "ldflags"
