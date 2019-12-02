package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorDemo {

	public static void main(String[] args) {
		//ExecutorService es=Executors.newFixedThreadPool(8);
		ExecutorService es=Executors.newCachedThreadPool();
		for(int i=0;i<100;i++) {
		es.submit(new Worker());
		}
		es.shutdown();

	}

}
