SECTION = "base"
LICENSE = "CLOSED"

PR = "${GLPR}"

DEPENDS = "virtual/libgles2 virtual/egl"

SRC_URI = "http://code.vuplus.com/download/release/kodi/xbmc-support_${MACHINE}_${GLPR}.tar.gz"

# The driver is a set of binary libraries to install
# there is nothing to configure or compile
do_configure[noexec] = "1"

do_install(){
    install -d ${D}${libdir}
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/xbmc-support/xbmc.helper ${D}${bindir}
    install -m 0755 ${WORKDIR}/xbmc-support/libxbmc_base.so ${D}${libdir}
}

FILES_SOLIBSDEV = ""
FILES_${PN} = "${bindir}/xbmc.helper ${libdir}/libxbmc_base.so"

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_SYSROOT_STRIP = "1"

PACKAGE_ARCH = "${MACHINE_ARCH}"
