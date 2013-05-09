require recipes-images/angstrom/console-image.bb

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

export IMAGE_BASENAME = "ecubee-console-image"

