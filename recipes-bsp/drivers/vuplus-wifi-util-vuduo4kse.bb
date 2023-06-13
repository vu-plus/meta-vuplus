require vuplus-wifi-util.inc

COMPATIBLE_MACHINE = "^(vuduo4kse)$"

PV="17.1"
SRCDATE = "20230613"
SRCDATE_PR = "r0"
PR_append = ".0"

SRC_URI[md5sum] = "fc0f909ad46dfb7f4d2ee73607c3dbbd"
SRC_URI[sha256sum] = "240bfad0e6504d175a4f1266c077da12e9904ab310d92203ac2ff027f4eaeba0"

inherit update-rc.d

INITSCRIPT_PARAMS = "start 60 S ."
INITSCRIPT_NAME = "vuplus-wifi-init.sh"

do_install_append() {
	install -d ${D}${INIT_D_DIR}
	install -m 0755 ${S}/${INITSCRIPT_NAME} ${D}${INIT_D_DIR}/${INITSCRIPT_NAME}
}
