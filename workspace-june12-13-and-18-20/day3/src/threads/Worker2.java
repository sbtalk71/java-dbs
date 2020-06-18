package threads;

public class Worker2 implements Runnable {

	MessagePrinter printer;
	String message;

	public Worker2(MessagePrinter printer, String message) {
		this.printer = printer;
		this.message = message;
	}

	@Override
	public void run() {
		synchronized (printer) {
			printer.greet(message);
		}
		
	}

}
