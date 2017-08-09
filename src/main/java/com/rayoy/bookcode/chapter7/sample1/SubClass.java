package com.rayoy.bookcode.chapter7.sample1;

public class SubClass extends SuperClass {
	public static int svalue = 234;
	static {
		System.out.println("SubClass init!");
	}
}