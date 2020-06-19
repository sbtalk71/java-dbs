package com.demo.java.lang;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="hello";
		String s2="hello";
		String s3="hello";
		String s4="Hello";
		String s5=new String("hello");
		
		System.out.println(s3==s5);
		
		System.out.println(s1.compareTo(s4));
		
		String s6="this is a java class as java is simple";
		
		System.out.println(s6.length());
		System.out.println(s6.indexOf("as"));
		
		
		String[] words=s6.split(" ");
		
		Arrays.asList(words).stream().forEach(System.out::println);
	}

}
