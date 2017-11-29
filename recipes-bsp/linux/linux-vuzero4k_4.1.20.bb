require linux-vuplus-4.1.20.inc

MACHINE_KERNEL_PR_append = "${PR_INC}.0"

SRC_URI[md5sum] = "9403441e47266f37ce8d9e2cdf34159d"
SRC_URI[sha256sum] = "5f5a43e222716962336df55eb98bd96001de2caf7b7dce538e266f5ba6851af6"

KSRC_VER = "4.1-1.9"

SRC_URI += "\
"

COMPATIBLE_MACHINE = "vuzero4k"

