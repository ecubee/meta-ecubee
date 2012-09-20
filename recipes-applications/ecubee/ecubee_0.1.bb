DESCRIPTION = "EcubeE main Demo application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

# @TODO: set all dependencies, DEPENDS = compile time, RDEPENDS = run time
DEPENDS += "openscenegraph"
RDEPENDS += "openscenegraph"

PR = "r16"

S="${WORKDIR}/git"
SRC_URI = "git://github.com/mlaurijsse/ecubee.git;branch=master"

# Bitbakes likes a fixed version
SRCREV = "f24c9b7a4ed0452aeb162ed358ebb881fba8d897"


inherit cmake
