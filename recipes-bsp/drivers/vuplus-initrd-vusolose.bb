require vuplus-initrd.inc

do_install() {
	install -d ${D}/boot
        install -m 0755 ${WORKDIR}/vmlinuz-initrd-7241b0 ${D}/boot/initrd_cfe_auto.bin
}

SRCDATE = "20140728"
SRC_URI[md5sum] = "908f5bd70cb3d6be3b002393fc7e797a"
SRC_URI[sha256sum] = "cf0d93b11468636c3a1d3f6a3beea50f6027a59aabf0f73109367755bcd00add"