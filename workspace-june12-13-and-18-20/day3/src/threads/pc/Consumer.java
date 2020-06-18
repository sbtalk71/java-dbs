package threads.pc;

public class Consumer implements Runnable {

	private Queue q;
	 public Consumer(Queue q) {
		this.q=q;
	}
	@Override
	public void run() {
		
		try {
			while(true) {
				q.get();
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
