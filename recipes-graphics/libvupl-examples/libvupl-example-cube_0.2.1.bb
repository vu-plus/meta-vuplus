DESCRIPTION = "Cube Demo example for libvupl"
SECTION = "devel"
HOMEPAGE = "https://code.google.com/archive/p/opengles-book-samples/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c01ce978e205f99897d26c061b2c09a"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "^(vusolose|vusolo2|vuduo2|vusolo4k|vuuno4k|vuuno4kse|vuultimo4k|vuzero4k|vuduo4k|vuduo4kse)$"

PR = "r1"

DEPENDS = "libvupl-${MACHINE} libgles-${MACHINE}"
RDEPENDS_${PN} = "libvupl-${MACHINE} libgles-${MACHINE}"

SRC_URI = "http://code.vuplus.com/download/release/support/${BPN}-${PV}.${PR}.tar.gz"

S = "${WORKDIR}/${PN}-${PV}"

EXTRA_OECMAKE += "-DVUPLUS=1"

inherit cmake

# fix old source for recent egl headers
do_configure_prepend() {
	sed -i "s/-DVUPLUS/-DVUPLUS -DEGL_NO_X11/g" ${S}/Common/CMakeLists.txt
	sed -i "s/-DVUPLUS/-DVUPLUS -DEGL_NO_X11/g" ${S}/Simple_VertexShader/CMakeLists.txt
}

do_install() {
	install -d ${D}/usr/bin
	install -m 0755 ${WORKDIR}/build/Simple_VertexShader/Simple_VertexShader ${D}/usr/bin/cube
}

SRC_URI[md5sum] = "a904074c39b7d37293e1ff2cfe990b77"
SRC_URI[sha256sum] = "eeda739794d85a79e0beaafd836136367ff50d85a7adf8bba5b40874c3377c9f"
