DESCRIPTION = "EcubeE main Demo application"
LICENSE = "GPL"

RDEPENDS += "openscenegraph"

PR = "r3"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/mlaurijsse/ecubee.git;branch=master"

# Bitbakes likes a fixed version
SRCREV = "6606fcf1733098ab762223e39e94567ea2e87a94"

inherit cmake
