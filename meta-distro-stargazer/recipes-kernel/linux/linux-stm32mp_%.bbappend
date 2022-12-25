FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI += "file://${LINUX_VERSION}/${LINUX_VERSION}.${LINUX_SUBVERSION}/0001-Stargazer-OS-Kernel-Enablement.patch"

KERNEL_FEATURES:append ="${LINUX_VERSION}/linux-config/kjconfig.scc"