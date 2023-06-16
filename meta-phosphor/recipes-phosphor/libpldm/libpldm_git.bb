SUMMARY = "libpldm shared library"
DESCRIPTION = "PLDM library implementing various PLDM specifications"
HOMEPAGE = "https://github.com/openbmc/libpldm"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
SRCREV = "a5c3287e9b2b08ad810f5c9d4fc8805a0125ba73"
LIBPLDM_ABI_STABLE = "deprecated,stable"
LIBPLDM_ABI_TESTING = "deprecated,stable,testing"
PACKAGECONFIG[abi-testing] = "-Dabi=${LIBPLDM_ABI_TESTING},-Dabi=${LIBPLDM_ABI_STABLE},,"
PACKAGECONFIG[oem-ibm] = "-Doem-ibm=enabled,-Doem-ibm=disabled,,"

PV = "0.1.0+git${SRCPV}"
PR = "r1"
SRC_URI = "git://github.com/openbmc/libpldm;branch=main;protocol=https"

S = "${WORKDIR}/git"

inherit meson

EXTRA_OEMESON:append = " -Dtests=disabled"
