DESCRIPTION = "EcubeE main Demo application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

# @TODO: set all dependencies, DEPENDS = compile time, RDEPENDS = run time
DEPENDS += "openscenegraph"
RDEPENDS += "openscenegraph"

PR = "r16"

S="${WORKDIR}/git"
SRC_URI = "git://github.com/mlaurijsse/Ecubee.git;branch=master"

# Bitbakes likes a fixed version
SRCREV = "27b176e36b421e6ab3d7d2fb5196870b28912451"


inherit cmake
