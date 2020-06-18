package threads.pc;

public class PCMain {

	public static void main(String[] args) {
		Queue q=new Queue();
		
		Thread t1=new Thread(new Producer(q));
		Thread t2=new Thread(new Consumer(q));
		
		t1.start();
		t2.start();
	}

}
