SUMMARY = "inovex Training Image"
DESCRIPTION = "The inovex Training Image describes what's going to be installed to our custom Yocto image"
HOMEPAGE = "www.inovex.de"


IMAGE_INSTALL = "packagegroup-core-boot"

IMAGE_INSTALL:append = " \
    btop \
    nano \
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

IMAGE_LINGUAS = ""
GLIBC_GENERATE_LOCALES = ""


inherit core-image
