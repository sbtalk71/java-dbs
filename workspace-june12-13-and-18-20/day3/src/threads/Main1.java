package threads;

public class Main1 {

	public static void main(String[] args) throws Exception{
		
		MyThread t1= new MyThread();
		MyThread t2=new MyThread();
		
		t1.setName("Iron Man");
		//t1.setPriority(9);
		t2.setName("Cap America");
		//t2.setPriority(7);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	System.out.println("Main Thread exits...");
		

	}

}
