package com.example.ndk;

public class MyLib {
	static {
		System.loadLibrary("MyLib");
	}
	public native int add (int x,int y);
	public native int subtract (int x, int y);
	
}
