require recipes-images/angstrom/systemd-gnome-image.bb

IMAGE_INSTALL += " \
	ecubee \
	ecubee-configure \
	openscenegraph-dev \
	task-sdk-target \
	i2c-tools-dev \
	nano \
	git \
	screen \
"

export IMAGE_BASENAME = "ecubee-GNOME-image"

