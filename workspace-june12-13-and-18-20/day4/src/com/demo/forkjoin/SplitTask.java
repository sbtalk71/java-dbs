package com.demo.forkjoin;

import java.util.concurrent.RecursiveAction;

public class SplitTask extends RecursiveAction {

	private double data;

	public SplitTask(double data) {
		this.data = data;
	}

	@Override
	protected void compute() {
		if (data > 10) {
			SplitTask t1 = new SplitTask(data / 2);
			SplitTask t2 = new SplitTask(data / 2);
			t1.fork();
			t2.fork();
			t1.join();
			t2.join();
		} else {
			System.out.println(Thread.currentThread().getName()+"  Split Data : " + data);
		}
	}

}
