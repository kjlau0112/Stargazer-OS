DESCRIPTION = "xcowsay displays a cute cow and message on your desktop"
LICENSE = "GPL-3.0"
DEPENDS = "gtk+ dbus"
LIC_FILES_CHKSUM ="file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "http://www.nickg.me.uk/files/xcowsay-${PV}.tar.gz"

inherit autotools


SRC_URI[md5sum] = "cf08b324b67d5761158344adcea89402"
SRC_URI[sha256sum] = "e0dd4b753690c650c6bfbb5af9d190fa6bb3d889a491c8553a34ba397ede8bbc"