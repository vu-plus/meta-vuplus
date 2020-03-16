require linux-vuplus-3.13.5.inc

MACHINE_KERNEL_PR_append = "${PR_INC}.4"

COMPATIBLE_MACHINE = "vuzero"

SRC_URI += " \
	file://linux_nand_bcm.patch \
"
