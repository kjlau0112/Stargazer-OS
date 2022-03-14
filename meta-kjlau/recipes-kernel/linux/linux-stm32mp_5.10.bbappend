FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://kj.cfg \
            file://${LINUX_VERSION}/${LINUX_VERSION}.${LINUX_SUBVERSION}/0001-Stargazer-OS-Kernel-Enablement.patch"

#Appply default kernel config
KERNEL_DEFCONFIG:stm31mp1 = "defconfig"

LINUX_EXTENSION_VERSION="-kjlau0112"