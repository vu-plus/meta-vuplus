DESCRIPTION = "Opera HbbTV browser"
PRIORITY = "optional"
LICENSE = "CLOSED"
SECTION = "base"

DEPENDS = "mpfr gmp"
RREPLACES_${PN} = "vuplus-opera-browser-util"
RCONFLICTS_${PN} = "vuplus-opera-browser-util"
PACKAGES = "${PN}"

SRC_DATE = "20150106_0"
PR = "r1_${SRC_DATE}"

SRC_URI = ""
SRC_FILE = "opera-hbbtv_${SRC_DATE}.tar.gz"
SRC_URI[md5sum] = "531bb6c69f682b04b563a17160773014"
SRC_URI[sha256sum] = "3f8f885b3679db592acd09120dc8f29911bf34ac811df41e6abb87440e394b94"

S = "${WORKDIR}/opera-hbbtv"

do_fetch() {
       if [ ! -e ${DL_DIR}/${SRC_FILE} -a -e /etc/vuplus_browser.pwd ]; then
sshpass -f /etc/vuplus_browser.pwd sftp -o StrictHostKeyChecking=no guestuser@code.vuplus.com << +
get ${SRC_FILE}
bye
+
       fi
       cp -av ${DL_DIR}/${SRC_FILE} ${WORKDIR}/
}

do_unpack() {
       tar xvfz ${SRC_FILE}
}

do_compile() {
}

do_install() {
	install -d ${D}/usr/local/hbb-browser
	cp -avR ${S}/opera/* ${D}/usr/local/hbb-browser/

	install -d ${D}/usr/lib
	cp -avR ${S}/dfb/usr/lib/* ${D}/usr/lib/
}

do_package_qa() {
}

sysroot_stage_all() {
}

INHIBIT_PACKAGE_STRIP = "1"
PRIVATE_LIBS_${PN} = "libopera_hbbtv.so \
libdsmcc.so \
libdirect-1.4.so.6 \
libdirectfb-1.4.so.6 \
libfusion-1.4.so.6 \
libdirectfbwm_default.so \
libdirectfb_linux_input.so \
libdirectfb_devmem.so \
libdirectfb_dummy.so \
libdirectfb_fbdev.so \
libidirectfbfont_dgiff.so \
libidirectfbvideoprovider_v4l.so \
libidirectfbvideoprovider_gif.so \
libidirectfbimageprovider_dfiff.so \
libidirectfbimageprovider_gif.so \
libidirectfbimageprovider_jpeg.so \
libicoreresourcemanager_test.so \
libdirectfb_vuplus.so"

FILES_${PN} = "/usr/lib /usr/local"
