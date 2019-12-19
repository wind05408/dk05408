package com.data.str;

public class StringMain {

	public static void main(String[] args) {
		function1();
		function2();
		function3();
		function4();
		function5();
	}
	
	public static void function1() {
		System.out.println("----------------------function1----------------------");
		String s1 = "a";//创建一个
		String s2 = new String("a");//创建两个
		System.out.println(s1 == s2);
	}
	
	public static void function2() {
		System.out.println("----------------------function2----------------------");
		String s1 = "a" + "b";//创建一个
		String s2 = "ab";//不再创建
		String s3 = "a";//创建一个
		String s4 = s3 + "b";//创建一个
		System.out.println(s1 == s2);
		System.out.println(s1 == s4);
	}
	
	public static void function3() {
		System.out.println("----------------------function3----------------------");
		String a = "a";//创建一个
		String b = "b";//创建一个
		String s1 = a + b;//创建一个
		String s2 = a + b;//创建一个
		System.out.println(s1 == s2);
	}
	
	public static void function4() {
		System.out.println("----------------------function4----------------------");
		final String a = "a";//创建一个
		final String b = "b";//创建一个
		String s1 = a + b;//创建一个
		String s2 = a + b;//不再创建
		String s3 = "ab";//不再创建
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}

	public static void function5(){
		System.out.println("----------------------function5----------------------");
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
	}
}