package threads.pc;

public class Producer implements Runnable {

	private Queue q;
	int i=0;
	
	 public Producer(Queue q) {
		this.q=q;
	}
	@Override
	public void run() {
		
		try {
			while(true) {
				q.put(i++);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
