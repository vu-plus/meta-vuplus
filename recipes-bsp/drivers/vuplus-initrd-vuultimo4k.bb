require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7445d0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20161011"
SRC_URI[md5sum] = "997063e4f91d4b301fe476e65aca56a6"
SRC_URI[sha256sum] = "ab6d4b4364333817f0a47d1e07d2214e732f96c7bafa94ce56619ac27c68f0ef"
