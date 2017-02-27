require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7366c0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20170209"
SRC_URI[md5sum] = "5baa24532311015aeb2b077ac23b9198"
SRC_URI[sha256sum] = "9180d7e73cf1f419a7919622e05092aacbc4c8fc7e876cc041d2dd4e7c2e2205"
