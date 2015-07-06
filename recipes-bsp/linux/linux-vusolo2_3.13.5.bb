require linux-vuplus-3.13.5.inc

MACHINE_KERNEL_PR_append = "${PR_INC}.4"

SRC_URI += " \
	file://linux-bcm_ethernet.patch \
"

COMPATIBLE_MACHINE = "vusolo2"
