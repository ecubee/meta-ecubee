DESCRIPTION = "EcubeE main Demo application"
LICENSE = "GPL"

RDEPENDS += "openscenegraph"

PR = "r1"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/mlaurijsse/ecubee.git;branch=master"

inherit cmake
