require systemd-image.bb

IMAGE_INSTALL += " \
	task-xserver \
"

export IMAGE_BASENAME = "ecubee-image"

