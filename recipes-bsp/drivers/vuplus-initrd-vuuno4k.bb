require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7439b0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20170209"
SRC_URI[md5sum] = "2b972c86995ad48212a25386966658a4"
SRC_URI[sha256sum] = "c383a7f67d05655c54822b1f7a89e54601831efdb530ecb6b903320e9539e9fa"
