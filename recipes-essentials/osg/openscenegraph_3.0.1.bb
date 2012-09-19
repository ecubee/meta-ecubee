DESCRIPTION = "The OpenSceneGraph is an open source high performance 3D graphics toolkit"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

DEPENDS += "libgles-omap3 curl libxml2 gtk+ ffmpeg poppler libxrandr"

PR = "r12"

inherit cmake

FILESPATH =. "${FILE_DIRNAME}/openscenegraph_3.0.1:"

SRC_URI = "http://www.openscenegraph.org/downloads/developer_releases/OpenSceneGraph-3.0.1.zip;name=osg \
           file://gles.diff"

SRC_URI[osg.md5sum] = "c43a25d023e635c3566b2083d8e6d956"
SRC_URI[osg.sha256sum] = "0c1103574b0a5a27c7d68d43454f1bf9c0cea114a583c42637bc8eb47b1d8296"

S = "${WORKDIR}/OpenSceneGraph-${PV}"

# choose between
# _OPENTHREADS_ATOMIC_USE_GCC_BUILTINS
# _OPENTHREADS_ATOMIC_USE_MUTEX

# From http://www.openscenegraph.org/projects/osg/wiki/Community/OpenGL-ES
EXTRA_OECMAKE = " -DCMAKE_BUILD_TYPE=Release \
                  -DOSG_GLU_AVAILABLE=OFF \
                  -DOSG_GL1_AVAILABLE=OFF \
                  -DOSG_GL2_AVAILABLE=OFF \
                  -DOSG_GL3_AVAILABLE=OFF \
                  -DOSG_GLES1_AVAILABLE=OFF \
                  -DOSG_GLES2_AVAILABLE=ON \
                  -DOPENGL_egl_LIBRARY=/usr/lib/libEGL.so \
                  -DOPENGL_gl_LIBRARY=/usr/lib/libGLESv2.so \
                  -DOSG_GL_DISPLAYLISTS_AVAILABLE=OFF \
                  -DOSG_GL_MATRICES_AVAILABLE=OFF \
                  -DOSG_GL_VERTEX_FUNCS_AVAILABLE=OFF \
                  -DOSG_GL_VERTEX_ARRAY_FUNCS_AVAILABLE=OFF \
                  -DOSG_GL_FIXED_FUNCTION_AVAILABLE=OFF \
                  -DOSG_CPP_EXCEPTIONS_AVAILABLE=OFF \
                  -DPOPPLER_HAS_CAIRO_EXITCODE=0 \
                  -D_OPENTHREADS_ATOMIC_USE_GCC_BUILTINS=1 \
                "

TARGET_CC_ARCH += "-D__STDC_CONSTANT_MACROS"

FILES_${PN} = " ${bindir}/* ${libdir}/osgPlugins-${PV}/*.so "
FILES_${PN}-dbg += "${libdir}/osgPlugins-${PV}/.debug"

python populate_packages_prepend () {
	glibdir = bb.data.expand('${libdir}', d)

	do_split_packages(d, glibdir, '^lib(.*)\.so\.*', 'lib%s', 'OpenSceneGraph %s library', extra_depends='', allow_links=True)
}

ALLOW_EMPTY = "1"




