require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7439b0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20170627"
SRC_URI[md5sum] = "8f96e5527503a4fe776c69887e93d613"
SRC_URI[sha256sum] = "055e0a3b1fed3a524f2ae41b93d77a024effcddf85dcbee9857749366d0823a4"
