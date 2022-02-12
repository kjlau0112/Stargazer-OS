SUMMARY = "stargazer core-image-minimal"
DESCRIPTION = "it just core-image-minimal"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

ROOTFS_POSTPROCESS_COMMAND += "change_expiry;"
PACKAGE_INSTALL_append ="base-passwd shadow"

change_expiry(){
        export PSEUDO="${FAKEROOTENV} ${STAGING_DIR_NATIVE}${bindir}/pseudo"
        flock -x ${IMAGE_ROOTFS}${sysconfdir} -c "$PSUEDO chage -R ${IMAGE_ROOTFS} -d0 root"
}
