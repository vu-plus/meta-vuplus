require linux-vuplus-3.14.28.inc

MACHINE_KERNEL_PR_append = "${PR_INC}.0"

SRC_URI += "\
"

COMPATIBLE_MACHINE = "vusolo4k"
