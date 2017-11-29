require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7260a0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20170522"
SRC_URI[md5sum] = "fb602c04f92d99c4109cdb4578dfb614"
SRC_URI[sha256sum] = "36a469463f5adef633dc0943a73c3989ec834393ca399cf1ad0d50aad0c01455"
