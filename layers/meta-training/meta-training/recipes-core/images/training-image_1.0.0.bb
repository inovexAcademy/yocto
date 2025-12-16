SUMMARY = "inovex Training Image"
DESCRIPTION = "The inovex Training Image describes what's going to be installed to our custom Yocto image"
HOMEPAGE = "www.inovex.de"
LICENSE = "MIT | Apache-2.0"
LIC_FILE_CHKSUM = ""


IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_INSTALL:append = " \
    openssh \
    vim \
"

IMAGE_INSTALL:remove = " \
"

IMAGE_FEATURES:append = " \
    read-only-rootfs \
"

IMAGE_FSTYPES:remove = " \
    \
"

replace_something() {
}

ROOTFS_POSTPROCESS_COMMAND += "replace_something;"

IMAGE_LINGUAS = "de-de"

inherit core-image

