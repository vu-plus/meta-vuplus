require vuplus-wifi-util.inc

COMPATIBLE_MACHINE = "^(vuduo4k)$"

PV="18.1"
SRCDATE = "20230613"
SRCDATE_PR = "r0"
PR_append = ".0"

SRC_URI[md5sum] = "cd8a2d9f1648abe8c767d759f6d29d5a"
SRC_URI[sha256sum] = "2a72e157496037805a5efa6db82a32669b7ed3096716bce9a872c527d7633859"

inherit update-rc.d

INITSCRIPT_PARAMS = "start 60 S ."
INITSCRIPT_NAME = "vuplus-wifi-init.sh"

do_install_append() {
	install -d ${D}${INIT_D_DIR}
	install -m 0755 ${S}/${INITSCRIPT_NAME} ${D}${INIT_D_DIR}/${INITSCRIPT_NAME}
}
