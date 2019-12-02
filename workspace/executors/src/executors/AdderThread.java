package executors;

import java.util.concurrent.Callable;

public class AdderThread implements Callable<Integer> {

	private int a;
	private int b;

	public AdderThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() throws Exception {
		try {
			Thread.sleep(100);
			System.out.println(Thread.currentThread().getName()+" adding "+a+" and "+b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a+b;
	}
}
