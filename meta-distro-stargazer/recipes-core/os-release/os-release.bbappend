FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

ID = "${DISTRO}"
NAME = "${DISTRO_NAME}"
VERSION = "1.1.1"
VERSION_ID = "1.1.1"
PRETTY_NAME = "${DISTRO_NAME} ${VERSION}"
BUILD_ID ?= "${DATETIME}"
BUILD_ID[vardepsexclude] = "DATETIME"

Git_URL="https://github.com/kjlau0112/stm32mp1minimal_dunfell"
OS_RELEASE_FIELDS:append = " Git_URL"