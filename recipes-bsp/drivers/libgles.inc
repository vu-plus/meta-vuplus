SECTION = "base"
LICENSE = "CLOSED"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PROVIDES = "virtual/libgles2 virtual/egl"
RPROVIDES_${PN} = "libEGL.so libGLESv2.so libdvb_base.so libdvb_client.so libnxpl.so libv3ddriver.so"

PV="15.1"
PR="${SRCDATE}.${SRCDATE_PR}"

S = "${WORKDIR}/libgles-${MACHINE}"

# Closed source
SRC_URI = "http://code.vuplus.com/download/release/libgles/libgles-${MACHINE}-${PV}-${PR}.tar.gz"

SRC_URI += "git://github.com/KhronosGroup/EGL-Registry;branch=main;name=eglh;subpath=api;destsuffix=${S}/egl"
SRCREV_eglh = "90b78b0662e2f0548cfd1926fb77bf628933541b"

SRC_URI += "git://github.com/KhronosGroup/OpenGL-Registry;branch=main;name=openglh;subpath=api;destsuffix=${S}/opengl"
SRCREV_openglh = "8261133c2645aaeef880c5f5a6e327f399bc9d04"

# BEGL patch for eglplatform.h
SRC_URI_append_vuduo2 = " file://vuxxo2-BEGL.patch"
SRC_URI_append_vusolo2 = " file://vuxxo2-BEGL.patch"
SRC_URI_append_vusolose = " file://vuxxo2-BEGL.patch"

do_install_prepend() {
	cp -a ${S}/egl/EGL/* ${S}/include/EGL/
	cp -a ${S}/egl/KHR/* ${S}/include/KHR/

	cp -a ${S}/opengl/GLES/*.h ${S}/include/GLES/
	cp -a ${S}/opengl/GLES2/* ${S}/include/GLES2/
}

do_install() {
	install -d ${D}${libdir}
	install -m 0755 ${S}/lib/*.so ${D}${libdir}
	ln -s libv3ddriver.so ${D}${libdir}/libEGL.so
	ln -s libv3ddriver.so ${D}${libdir}/libGLESv2.so

	install -d ${D}${includedir}
	cp -a ${S}/include/* ${D}${includedir}/
}

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

# skip the check: we purposedly have two symlinks in the main package
INSANE_SKIP_${PN} = "dev-so"

FILESEXTRAPATHS_prepend := "${THISDIR}/vuplus-libgles:"
