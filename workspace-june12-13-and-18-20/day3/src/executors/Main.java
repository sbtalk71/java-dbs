package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		// ExecutorService ex=Executors.newSingleThreadExecutor();
		//ExecutorService ex = Executors.newCachedThreadPool();
		ExecutorService ex = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			ex.submit(new Worker());
		}

		ex.shutdown();

	}

}
