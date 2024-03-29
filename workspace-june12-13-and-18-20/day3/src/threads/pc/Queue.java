package threads.pc;

public class Queue {

	private int data;
	boolean valueSet = false;

	public synchronized void put(int data) {

		if (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		System.out.println("Put : " + this.data);
		this.valueSet = true;
		notify();

	}

	public synchronized void get() {
		if (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.valueSet=false;
		System.out.println("Got : " + this.data);
		notify();
	}
}
