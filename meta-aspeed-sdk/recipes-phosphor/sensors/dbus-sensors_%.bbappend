FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI:append:aspeed-g6 = " \
                 file://0001-change-pre-sensor-scaling-to-2.5v.patch \
                 file://0002-fansensor-support-ast2600-and-ast2700-pwm-driver.patch \
                 file://0003-fansensor-update-regular-expression-to-find-pwm.patch \
                 "
SRC_URI:append:aspeed-g7 = " \
                 file://0001-change-pre-sensor-scaling-to-2.5v.patch \
                 file://0002-fansensor-support-ast2600-and-ast2700-pwm-driver.patch \
                 file://0003-fansensor-update-regular-expression-to-find-pwm.patch \
                 "
