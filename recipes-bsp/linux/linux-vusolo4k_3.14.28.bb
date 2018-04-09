require linux-vuplus-3.14.28.inc

MACHINE_KERNEL_PR_append = "${PR_INC}.2"

SRC_URI += "\
	file://linux_rpmb_not_alloc.patch \
"

COMPATIBLE_MACHINE = "vusolo4k"
