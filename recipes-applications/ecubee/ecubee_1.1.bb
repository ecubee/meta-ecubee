DESCRIPTION = "EcubeE main Demo application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

# @TODO: set all dependencies, DEPENDS = compile time, RDEPENDS = run time
DEPENDS += "openscenegraph"
RDEPENDS += "openscenegraph"

PV = "1.1+gitr${SRCPV}"
#PR = "r16"

S="${WORKDIR}/git"
SRC_URI = "git://github.com/mlaurijsse/Ecubee.git;branch=master"

# Bitbakes likes a fixed version

SRCREV = "d759452486a6c719dc594ce6448c4536c3a45b4d"
#inherit autotools
inherit cmake
