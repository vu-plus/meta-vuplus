require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7278b1 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20181030"
SRC_URI[md5sum] = "2280778c1a445ea7727268597ac559be"
SRC_URI[sha256sum] = "42d3bac078edfc0c80d82caad708fdb4eca5cef5d130e7fc2e6fafdb11e66b64"
