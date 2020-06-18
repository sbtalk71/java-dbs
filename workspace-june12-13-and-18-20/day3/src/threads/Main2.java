package threads;

public class Main2 {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(new MyWorker());

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 11; i++) {
				try {
					Thread.sleep(2000);
					System.out.println(
							Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " : " + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Main Thread exits...");

	}

}
