package com.demo.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("karan","salman","ritu","ankit","arun","charan","kiran");
		
		//names.stream().filter(s->s.contains("a")).forEach(a->System.out.println(a));
		
		names.sort((a,b)->a.compareTo(b));
		names.forEach(System.out::println);
		
		
		

	}

}
