# Ecubee Image based on Angstroms systemd-image
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

IMAGE_INSTALL += " \
	angstrom-systemd-image \
	openscenegraph \
	task-xserver \
"

export IMAGE_BASENAME = "ecubee-image"

