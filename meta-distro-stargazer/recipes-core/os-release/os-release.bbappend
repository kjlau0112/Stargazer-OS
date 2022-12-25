FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

ID = "${DISTRO}"
NAME = " Stargazed OS derived from :${DISTRO_CODENAME}"
VERSION = "${DISTRO_VERSION}"
VERSION_ID = "${DISTRO_VERSION}"
PRETTY_NAME = "${DISTRO_NAME} ${VERSION}"
BUILD_ID ?= "${DATETIME}"
BUILD_ID[vardepsexclude] = "DATETIME"

Git_URL="https://github.com/kjlau0112/Stargazer-OS"
OS_RELEASE_FIELDS:append = " Git_URL BUILD_ID"