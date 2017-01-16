require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7439b0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20170112"
SRC_URI[md5sum] = "f54c8fec94279a4752b2104423e69c82"
SRC_URI[sha256sum] = "e231a804420d2cb8bf387f5044c9f450abfb2a6ffe6f561400732ddd761d219f"
