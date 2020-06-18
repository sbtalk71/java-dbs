package executors;

import java.util.concurrent.Callable;

public class AdderTask implements Callable<Integer> {

	private int a;
	private int b;

	public AdderTask(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() throws Exception {
		try {
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName() + " adding " + a + " and " + b);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a + b;
	}

}
