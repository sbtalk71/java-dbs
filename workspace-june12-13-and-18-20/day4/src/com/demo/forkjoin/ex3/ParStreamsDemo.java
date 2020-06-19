package com.demo.forkjoin.ex3;

import java.util.ArrayList;
import java.util.List;

public class ParStreamsDemo {

	public static void main(String[] args) {
		List<Integer> numList=new ArrayList<Integer>();
		for(int x=1;x<1000;x++) {
			numList.add(x);
		}
		
		int sum=numList.parallelStream().filter(a->a%2==0).mapToInt(a->a.intValue()).reduce(0, (x,y)->(x+y));
		System.out.println(sum);
		
	}
}
