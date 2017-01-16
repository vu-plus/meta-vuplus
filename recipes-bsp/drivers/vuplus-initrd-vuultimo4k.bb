require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7445d0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20170112"
SRC_URI[md5sum] = "e9b7f1f9350d92ed06c45bc9933b1ec6"
SRC_URI[sha256sum] = "8d844e0c44d458ede6837d499504fff328e9d869af88515c684036cf6d52f176"
