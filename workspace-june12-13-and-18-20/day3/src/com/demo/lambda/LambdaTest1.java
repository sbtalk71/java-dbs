package com.demo.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest1 {

	public static void main(String[] args) {
		
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		
//		for(Integer x:nums) {
//			if(x%2==0) {
//				System.out.println(x);
//			}
//		}

		nums.stream().filter(a->a%2==0).forEach(MyConsumer::printData);
		
		MyConsumer consumer= new MyConsumer();
		
		
		nums.stream().filter(a->a%2==0).forEach(consumer::printData2);
		
		
		nums.stream().filter(a->a%2==0).forEach(System.out::println);
		
		//System.out.println(nums.stream().filter(a->a%2==0).count());
		//List evenNums=nums.stream().filter(a->a%2==0).collect(Collectors.toList());
		//System.out.println(evenNums);
		
		
		//System.out.println(nums.stream().filter(a->!(a%2==0)).mapToInt(a->a+a).count());
	
	}

//	class MyEvenFilter implements Predicate<Integer>{
//
//		@Override
//		public boolean test(Integer t) {
//			if(t%2==0) return true;
//			else
//			return false;
//		}
//		
//	}
}

//ClassName::static Method Name

class MyConsumer {
	
	public static void printData(int x) {
		System.out.println(x);
	}
	
	public void printData2(int x) {
		System.out.println(x);
	}
}
