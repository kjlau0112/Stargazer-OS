SUMMARY = "syslog circular application"
DESCRIPTION = "C++ application"
LICENSE = "MIT"
LIC_FILES_CHKSUM ="file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/crewjam/ringfile.git;protocol=https"
SRCREV = "edfb5e518e5a0c45e3572205cb8505dc28d56538"

inherit autotools

S = "${WORKDIR}"

# do_configure () {

#    ( cd ${S}/git; ./autogen.sh )
#    ( cd ${S}/git; ./configure --host=arm ; make)
# }
