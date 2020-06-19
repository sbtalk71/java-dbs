package com.demo.forkjoin.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class AdderForkJoinMain {

	public static void main(String[] args) {
		ForkJoinPool fjp=new ForkJoinPool();
		List<Integer> numList=new ArrayList<Integer>();
		for(int x=1;x<21;x++) {
			numList.add(x);
		}

		System.out.println(numList);
		AdderTask task=new AdderTask(numList);
		int sum=fjp.invoke(task);
		System.out.println("Sum = "+sum);
	}

}
