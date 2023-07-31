require linux-intel.inc

SRC_URI:prepend = "git://github.com/intel/mainline-tracking.git;protocol=https;name=machine;nobranch=1; \
                  "
KMETA_BRANCH = "yocto-6.4"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

DEPENDS += "elfutils-native openssl-native util-linux-native"

LINUX_VERSION_EXTENSION ??= "-mainline-tracking-${LINUX_KERNEL_TYPE}"

LINUX_VERSION ?= "6.4.0"
SRCREV_machine ?= "9bcda79692105fb9c92d422d74468c87ebee9b12"
SRCREV_meta ?= "7a654f3f799146d1a9bfbd78ddebdc53510951e9"

# Functionality flags
KERNEL_EXTRA_FEATURES ?= "features/netfilter/netfilter.scc features/security/security.scc"

UPSTREAM_CHECK_GITTAGREGEX = "^mainline-tracking-v6.4-linux-(?P<pver>(\d+)T(\d+)Z)$"
