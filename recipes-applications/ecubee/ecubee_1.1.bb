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

SRCREV = "ca450c492c4c6676329c576f4975b5432adcd575"
inherit autotools
#inherit cmake
