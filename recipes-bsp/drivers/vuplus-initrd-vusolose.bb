require vuplus-initrd.inc

do_install() {
	install -d ${D}/boot
        install -m 0755 ${WORKDIR}/vmlinuz-initrd-7241b0 ${D}/boot/initrd_cfe_auto.bin
}

SRCDATE = "20150821"
SRC_URI[md5sum] = "eb5efad0435e7c455a2e8bf1a56eb551"
SRC_URI[sha256sum] = "e374477d429c901611e81c4b38d32228aa69f42edb002d0d555023d9ba6a6816"
