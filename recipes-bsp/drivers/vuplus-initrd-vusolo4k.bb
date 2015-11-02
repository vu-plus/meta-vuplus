require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7366b0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20150901"
SRC_URI[md5sum] = "825b9e90b49742358ec162db13e75d9d"
SRC_URI[sha256sum] = "d5fa2dd43cca9070e0be857ddbc57ed82b918a23c5daa9b4243aeee4c33e3911"
