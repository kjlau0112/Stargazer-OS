SUMMARY = "syslog circular application"
DESCRIPTION = "C++ application"
LICENSE = "MIT"
LIC_FILES_CHKSUM ="file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"



SRC_URI = " file://circular-log.cpp \
            file://varint.h \
            file://varint.cpp \
            file://ringfile_internal.h \
            file://ringfile.cpp \
            file://command.h \
            file://command.cpp \
          "

CXXFLAGS += "-std=gnu++11"

S = "${WORKDIR}"

do_compile() {
     ${CXX} ${CXXFLAGS} ${S}/circular-log.cpp ${S}/ringfile.cpp ${S}/varint.cpp ${S}/command.cpp ${LDFLAGS} -o ${S}/circular
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/circular ${D}${bindir}
    rm ${S}/*.cpp
    rm ${S}/*.h
}