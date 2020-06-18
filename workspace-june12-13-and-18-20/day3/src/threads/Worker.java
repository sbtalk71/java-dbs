package threads;

public class Worker implements Runnable {

	MessagePrinter printer;
	String message;

	public Worker(MessagePrinter printer, String message) {
		this.printer = printer;
		this.message = message;
	}

	@Override
	public void run(){

		synchronized (printer) {
			printer.print(message);
		}
		
	}

}
