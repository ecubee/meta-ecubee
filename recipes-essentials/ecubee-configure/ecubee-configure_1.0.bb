DESCRIPTION = "Configure script to turn generic image into bart, gertjan or martijn"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r6"

#inherit autotools

FILESPATH =. "${FILE_DIRNAME}/ecubee-configure_1.0:"
SRC_URI = "file://ecubee-configure.tar.gz"

S = "${WORKDIR}/src"

do_install() {
	install -d ${D}${base_libdir}/systemd/system/
	install -m 0644 ${WORKDIR}/src/*.service ${D}${base_libdir}/systemd/system

	install -d ${D}${sysconfdir}/udev/rules.d
	install -d ${D}${sysconfdir}/ecubee
	install -d ${D}${sysconfdir}/modules-load.d
	install -m 0644 ${WORKDIR}/src/*.rules ${D}${sysconfdir}/udev/rules.d
	install -m 0644 ${WORKDIR}/src/hostname-* ${D}${sysconfdir}/ecubee
	install -m 0644 ${WORKDIR}/src/interfaces ${D}${sysconfdir}/ecubee
	install -m 0644 ${WORKDIR}/src/g_ether.conf ${D}${sysconfdir}/modules-load.d

	install -d ${D}${bindir}
	install -m 0755 ${WORKDIR}/src/*.sh ${D}${bindir}

	install -d ${D}/home/root
	install -m 0644 ${WORKDIR}/src/bashrc ${D}/home/root/.bashrc
}

FILES_${PN} += " /lib/systemd/system/*.service /home/root/.bashrc "



