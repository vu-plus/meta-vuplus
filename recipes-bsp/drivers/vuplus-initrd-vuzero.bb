require vuplus-initrd.inc

do_install() {
	install -d ${D}/boot
        install -m 0755 ${WORKDIR}/vmlinuz-initrd-7362a0 ${D}/boot/initrd_cfe_auto.bin
}

SRCDATE = "20141117"
SRC_URI[md5sum] = "670219b09ba2cace6ebe0492e514f340"
SRC_URI[sha256sum] = "fb23c93b727dd89e767e1d52c879045d8f40aecad049ec1d5b917843dfb0930e"
