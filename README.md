Weekend side hustle

What ever commit here is definitely working
and definitely tested with STM32MP157F-DK2

100% for fun.

Inspired by anime: Gundam Seed Stargazer

Build dependency:
-build-mp1
-meta-distro-stargazer
-meta-openembedded (only tested with commit:8ff12b)
-meta-st-stm32mp   (only tested with commit:58f52a)
-poky              (only tested with commit:64f632)

This project never mean to test with latest commit,
It just weekend learning to improvise yocto skillset.

Build ID working for this commit:
root@stm32mp1:~# cat /etc/os-release | grep BUILD 
BUILD_ID="20221225030206"
