package com.demo.lambda;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	
	public int doOperartion(int a, int b,Math m) {
		return m.calculate(a, b);
	}

	public static void main(String[] args) {
		Calculator c= new Calculator();
		System.out.println(c.doOperartion(10, 20, (x,y)->x+y));
		System.out.println(c.doOperartion(10, 20, (x,y)->x-y));
		System.out.println(c.doOperartion(10, 20, (x,y)->x*y));
		
		
		List<Integer> nums=new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(50);
		nums.add(33);
		nums.add(21);
		nums.add(42);
		nums.add(12);
		int sum=0;
		for(Integer i:nums) {
			if(i%3==0) {
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
		sum=nums.stream().filter(a->(a%2==0)).reduce((a,b)->(a+b)).get();
		System.out.println(sum);
		

	}

}
