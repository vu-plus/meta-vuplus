require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7445d0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20200326"
SRC_URI[md5sum] = "9daa46bc7e318e5bcbd4524e7f7ba013"
SRC_URI[sha256sum] = "0d78b95dfa3ae156aa1142393eb6bd624ee7bdace98de6a3c5a9ef9b3533f04f"
