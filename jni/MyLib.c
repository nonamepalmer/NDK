#include "com_example_ndk_MyLib.h"

JNIEXPORT jint JNICALL Java_com_example_ndk_MyLib_add (JNIEnv *env, jobject obj, jint x, jint y){
	return x+y;
}
