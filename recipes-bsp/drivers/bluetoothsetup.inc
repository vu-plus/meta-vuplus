DESCRIPTION = "Vuplus bluetooth plugin"

inherit python3native

LICENSE = "CLOSED"

DEPENDS = "python3-native"
RDEPENDS_${PN} = "vuplus-bluetooth-util libusb-compat"

PN = "enigma2-plugin-systemplugins-bluetoothsetup"
PR = "${SRCDATE}.${SRCDATE_PR}"

SRC_URI = " \
    http://code.vuplus.com/download/release/bt/enigma2-plugin-bluetoothsetup-${MACHINE}-${PR}.tar.gz \
"

SRC_URI_append_vuduo4kse = " file://port-to-python3-20200320.patch"
SRC_URI_append_vuzero4k = " file://port-to-python3-20171114.patch"
SRC_URI_append_vuuno4k = " file://port-to-python3-20171114.patch"
SRC_URI_append_vuuno4kse = " file://port-to-python3-20171114.patch"

S = "${WORKDIR}/plugin"

BLUETOOTH_PLUGIN_PATH = "/usr/lib/enigma2/python/Plugins/SystemPlugins/BluetoothSetup"

do_install() {
	install -d  ${D}${BLUETOOTH_PLUGIN_PATH}
	cp -r --preserve=mode,links ${S}/* ${D}${BLUETOOTH_PLUGIN_PATH}
}

FILES_${PN} = "${BLUETOOTH_PLUGIN_PATH}"

#do_populate_sysroot[noexec] = "1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

INSANE_SKIP_${PN} = "already-stripped file-rdeps"

