DESCRIPTION = "Vu+ miniTV plugin"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.GPLv2;md5=eb723b61539feef013de476e68b5c50a"
BRANCH = "master"
S = "${WORKDIR}/git"
SRC_URI = "git://code.vuplus.com/git/miniTV.git;protocol=http;branch=${BRANCH}"

inherit gitpkgv
SRCREV = "b40764d1c3668134cb0d75de9cb69df74a00feb6"
PV = "git${SRCPV}"
PKGV = "git${GITPKGV}"

FILES_${PN} = " \
	/usr/lib/enigma2/python/Plugins/Extensions/MiniTV/* \
"

do_install() {
	install -d ${D}/usr/lib/enigma2/python/Plugins/Extensions/MiniTV
	install -m 0644 ${S}/*.py ${D}/usr/lib/enigma2/python/Plugins/Extensions/MiniTV

	python -O -m compileall ${D}/usr/lib/enigma2/python/Plugins/
}

