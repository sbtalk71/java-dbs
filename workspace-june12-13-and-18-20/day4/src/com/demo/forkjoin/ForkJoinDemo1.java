package com.demo.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo1 {

	public static void main(String[] args) {
		ForkJoinPool fjp = new ForkJoinPool();

		SplitTask task = new SplitTask(100);
		fjp.invoke(task);
	}

}
