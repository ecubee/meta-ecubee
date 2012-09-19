DESCRIPTION = "EcubeE main Demo application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

RDEPENDS += "openscenegraph"

PR = "r3"

S = "${WORKDIR}/git"
SRC_URI = "git://github.com/mlaurijsse/ecubee.git;branch=master"

# Bitbakes likes a fixed version
SRCREV = "6606fcf1733098ab762223e39e94567ea2e87a94"

inherit cmake
