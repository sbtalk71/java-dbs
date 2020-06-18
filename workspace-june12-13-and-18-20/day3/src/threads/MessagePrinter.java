package threads;

public class MessagePrinter {

	public synchronized void print(String message) {
		try {
			System.out.print("[ " + message);
			Thread.sleep(5000);
			System.out.println(" ]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public  void greet(String message) {
		try {
			System.out.print("greeted with "+"[ " + message);
			Thread.sleep(5000);
			System.out.println(" ]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
