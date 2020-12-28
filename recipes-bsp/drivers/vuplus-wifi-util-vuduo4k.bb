require vuplus-wifi-util.inc

COMPATIBLE_MACHINE = "^(vuduo4k)$"

PV="18.1"
SRCDATE = "20201228"
SRCDATE_PR = "r0"
PR_append = ".0"

SRC_URI[md5sum] = "72b9151b3fbf37df5071bfd9d2660263"
SRC_URI[sha256sum] = "1e3fad4fddb2ba71290a6cb73bd8b5645a206f106fb13e85c96c2da413deb96f"

inherit update-rc.d

INITSCRIPT_PARAMS = "start 60 S ."
INITSCRIPT_NAME = "vuplus-wifi-init.sh"

do_install_append() {
	install -d ${D}${INIT_D_DIR}
	install -m 0755 ${S}/${INITSCRIPT_NAME} ${D}${INIT_D_DIR}/${INITSCRIPT_NAME}
}
