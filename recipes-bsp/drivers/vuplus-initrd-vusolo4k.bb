require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7366c0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20170112"
SRC_URI[md5sum] = "b3e6a9df20211076adbe2f33b8bbad87"
SRC_URI[sha256sum] = "c471b241f7d14ae401bfdd940307739d38b94213286a450078321def04f717a0"
