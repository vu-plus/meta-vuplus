# We know about rtc
MACHINE_FEATURES_BACKFILL_CONSIDERED = "rtc"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS = " \
	vuplus-dvb-modules-${MACHINE} \
	${@bb.utils.contains("GST_VERSION", "1.0", "gstreamer1.0-libav", "gst-ffmpeg", d)} \
"

KERNEL_MODULE_AUTOLOAD += "xfs"

MACHINE_EXTRA_RRECOMMENDS = " \
	vuplus-shutdown \
	gst-plugin-dvbmediasink \
	ntfs-3g \
"

MACHINE_EXTRA_RDEPENDS += "\
	kernel-module-sr-mod \
	${@bb.utils.contains("MACHINE_FEATURES", "opera-browser", "enigma2-plugin-extensions-hbbtv", "", d)} \
"

EXTRA_IMAGEDEPENDS += "\
	vuplus-hbbtv-dumpait \
	vuplus-tuner-turbo \
"

TARGET_ARCH = "mipsel"
DEFAULTTUNE = "mips32el"

DVBMEDIASINK_CONFIG = "--with-wmv --with-pcm --with-eac3"

PREFERRED_VERSION_linux-${MACHINE} = "3.9.6"

PREFERRED_PROVIDER_virtual/kernel = "linux-${MACHINE}"

PREFERRED_PROVIDER_virtual/blindscan-dvbc = "vuplus-blindscan-utils-${MACHINE}"
PREFERRED_PROVIDER_virtual/blindscan-dvbs = "vuplus-blindscan-utils-${MACHINE}"

IMAGE_FSTYPES ?= "ubi"

UBI_VOLNAME = "rootfs"
MKUBIFS_ARGS = "-m 2048 -e 126976 -c 4096 -F"
UBINIZE_ARGS = "-m 2048 -p 128KiB"

IMAGEDIR ?= "${MACHINE}"
IMGDEPLOYDIR ?= "${DEPLOY_DIR_IMAGE}"
EXTRA_IMAGECMD_COMPAT = " --eraseblock=0x20000 -n -l "

IMAGE_CMD_ubi_prepend = " \
	rm -rf ${IMAGE_ROOTFS}/boot/*; \
	rm -rf ${IMAGE_ROOTFS}/tmp/*; \
"

IMAGE_CMD_ubi_append = " \
	mkdir -p ${IMGDEPLOYDIR}/vuplus/${UPDATE_DIR}; \
	cp -f ${IMGDEPLOYDIR}/${IMAGE_NAME}.rootfs.ubi ${IMGDEPLOYDIR}/vuplus/${UPDATE_DIR}/root_cfe_auto.jffs2; \
	gzip -f -9c ${DEPLOY_DIR_IMAGE}/vmlinux-${MACHINE}.bin > ${IMGDEPLOYDIR}/vuplus/${UPDATE_DIR}/kernel_cfe_auto.bin; \
	cd ${IMGDEPLOYDIR}; \
	zip ${DISTRO_NAME}-${DISTRO_VERSION}-${MACHINE}_usb.zip vuplus/${UPDATE_DIR}/*; \
	rm -rf vuplus; \
"

MACHINE_FEATURES += "alsa usbhost wlan kernelwifi externalwifi 3dtv switchoff osdposition hdmicec"

require conf/machine/include/tune-mips32.inc
