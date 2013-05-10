require recipes-images/angstrom/console-image.bb

IMAGE_INSTALL += " \
	ecubee \
	ecubee-configure \
	openscenegraph-dev \
	task-xserver \
	task-sdk-target \
	i2c-tools-dev \
	nano \
	git \
	screen \
	libgles-omap3 \
	libgles-omap3-dev \
	libgles-omap3-dbg \
	libgles-omap3-x11demos \
	libgles-omap3-rawdemos \
"

export IMAGE_BASENAME = "ecubee-xserver-image"

