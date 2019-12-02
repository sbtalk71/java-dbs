package day5.fj1;

import java.util.concurrent.RecursiveAction;

public class MySplitTask extends RecursiveAction {

	private double data;

	public MySplitTask(double data) {
		this.data = data;
	}

	@Override
	protected void compute() {
		int result = 0;
		if (data > 10) {
			
			System.out.println(Thread.currentThread().getName());
			MySplitTask t1 = new MySplitTask(data / 2);
			MySplitTask t2 = new MySplitTask(data / 2);
			t1.fork();
			t2.fork();
			t1.join();
			t2.join();
	
		} else {
			System.out.println("The Split Data : " + data);
		}
	}

}
