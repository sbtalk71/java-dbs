package threads;

public class SynchMain {

	public static void main(String[] args) throws Exception {
		MessagePrinter printer=new MessagePrinter();
		
		Thread t1=new Thread(new Worker(printer,"Hello"));
		Thread t2=new Thread(new Worker(printer,"Good"));
		Thread t3=new Thread(new Worker(printer,"World"));
		
		
		Thread t4=new Thread(new Worker2(printer,"evening"));
		Thread t5=new Thread(new Worker2(printer,"Noon "));
		Thread t6=new Thread(new Worker2(printer,"Morning"));
		
		t1.start();
		t2.start();
		t3.start();
		
		t4.start();
		t5.start();
		t6.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		t4.join();
		t5.join();
		t6.join();

	}

}
