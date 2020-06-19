package com.demo.java.lang;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		//StringBuilder sb= new StringBuilder();
		StringBuffer sb=new StringBuffer();
		sb.append("I am ").append(" Scott").append(" am ").append(49).append(" years old");
		System.out.println(sb);
		sb.insert(sb.indexOf("Scott")+"Scott".length(), " I");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.toString().toUpperCase());
		
		sb.reverse();
		sb.replace(sb.indexOf("49"), sb.indexOf("49")+2, "40");
		System.out.println(sb);
		
		sb.delete(sb.lastIndexOf("I"), sb.lastIndexOf("old")+"old".length());
		System.out.println(sb);
		System.out.println(sb.substring(sb.indexOf("Scott")));
		

	}

}
