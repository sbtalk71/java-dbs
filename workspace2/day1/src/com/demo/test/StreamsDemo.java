package com.demo.test;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("ankur","sunitha","pinku","shantanu","lalith","lal","amith");
		
		//names.stream().filter(a->a.length()>6).forEach(a->System.out.println(a));
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,14,15,17,19);
		
		nums.parallelStream().filter(a->a%2==0).forEach(System.out::println);

	}

}
