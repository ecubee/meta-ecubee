# Ecubee Image based on Angstroms systemd-image
LICENSE = "MIT"
PR="r6"

IMAGE_PREPROCESS_COMMAND = "rootfs_update_timestamp"

DISTRO_UPDATE_ALTERNATIVES ??= ""
ROOTFS_PKGMANAGE_PKGS ?= '${@base_conditional("ONLINE_PACKAGE_MANAGEMENT", "none", "", "${ROOTFS_PKGMANAGE} ${DISTRO_UPDATE_ALTERNATIVES}", d)}'

CONMANPKGS ?= "connman connman-plugin-loopback connman-plugin-ethernet connman-plugin-wifi connman-systemd"
CONMANPKGS_libc-uclibc = ""



DEPENDS += "bzip2 \
"


IMAGE_INSTALL += " \
	task-base-extended \
	task-xserver \
	angstrom-task-boot \
	task-basic \
	${CONMANPKGS} \
	${ROOTFS_PKGMANAGE_PKGS} \
	timestamp-service \
	ecubee \
"

IMAGE_DEV_MANAGER   = "udev"
IMAGE_INIT_MANAGER  = "systemd"
IMAGE_INITSCRIPTS   = " "
IMAGE_LOGIN_MANAGER = "tinylogin shadow"

export IMAGE_BASENAME = "ecubee-image"

inherit image
