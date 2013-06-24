LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := MyLib
LOCAL_SRC_FILES := MyLib.c

include $(BUILD_SHARED_LIBRARY)