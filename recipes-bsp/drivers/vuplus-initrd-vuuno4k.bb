require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7439b0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20161011"
SRC_URI[md5sum] = "4f25e392d807d95c8ddf65b55555a4ab"
SRC_URI[sha256sum] = "9286713a2d2b6cf65ee5926f2d26ff44089b344f208d801bf9687b38125fb71b"
