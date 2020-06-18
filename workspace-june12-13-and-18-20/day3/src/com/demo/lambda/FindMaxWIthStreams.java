package com.demo.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxWIthStreams {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 22, 31, 44, 65);

		System.out.println(nums.stream().max((a,b)->a.compareTo(b)).get());
		
		int sum=nums.stream().filter(a->a%2==0).reduce(0,(x,y)->(x+y)).intValue();
		System.out.println(sum);
	}

}

//class MyMaxFinder implements Comparator<Integer> {
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		// TODO Auto-generated method stub
//		return o1.compareTo(o2);
//	}
//}