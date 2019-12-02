package executors;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class AdderMain2 {

	public static void main(String[] args) throws InterruptedException,ExecutionException {
		int sum = 0;
		ThreadPoolExecutor es = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
		ArrayList<Future<Integer>> results=new ArrayList<>();
		for (int i = 1; i < 10; i++) {
			Future<Integer> result = es.submit(new AdderThread(i, i + 2));
			results.add(result);
		}
		
		do {
			for(int i=0;i<results.size();i++) {
				System.out.println("status done : "+results.get(i).isDone());
			}
		}while(es.getCompletedTaskCount()<results.size());
		
		//results.stream().map(a->a.get()).reduce((a,b)->(a+b)).get();
		
		for(Future<Integer> x: results) {
			sum=sum+x.get();
		}
		es.shutdown();
		System.out.println("Sum = " + sum);

	}

}
