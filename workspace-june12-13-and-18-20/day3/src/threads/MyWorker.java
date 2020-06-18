package threads;

public class MyWorker implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" : "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
