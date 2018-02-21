require linux-vuplus-3.14.28.inc

MACHINE_KERNEL_PR_append = "${PR_INC}.1"

SRC_URI[md5sum] = "2a3a0a7e5cd2a1392f1a26790d1cd8bf"
SRC_URI[sha256sum] = "8284670c28a4dad9e94752b38d37a4368f27ce15e671653a3e2ac83915f37db1"

KSRC_VER = "3.14-1.12"

SRC_URI += "\
	file://bcmsysport_3.14.28-1.12.patch \
	file://linux_prevent_usb_dma_from_bmem.patch \
"

COMPATIBLE_MACHINE = "vuultimo4k"

