FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://kj.cfg"

#Appply default kernel config
KERNEL_DEFCONFIG:stm31mp1 = "defconfig"

LINUX_EXTENSION_VERSION="-kjlau0112"