require linux-vuplus-3.13.5.inc

MACHINE_KERNEL_PR_append = "${PR_INC}.0"

SRC_URI += " \
	file://brcm_s3_wol.patch \
"

COMPATIBLE_MACHINE = "vusolose"
