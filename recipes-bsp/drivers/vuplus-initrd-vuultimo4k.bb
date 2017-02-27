require vuplus-initrd.inc

do_install() {
    install -d ${D}/boot
    install -m 0755 ${WORKDIR}/vmlinuz-initrd-7445d0 ${D}/boot/initrd_auto.bin
}

SRCDATE = "20170209"
SRC_URI[md5sum] = "eb886ac801f585b04cffc218c44b60bf"
SRC_URI[sha256sum] = "ec268609e4d062dd0e75d249445d41589e2d7cf68521642102cc8fd91c3a8161"
