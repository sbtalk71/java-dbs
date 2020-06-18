package executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class AdderMain {

	public static void main(String[] args) throws Exception, ExecutionException {
		int sum = 0;

		//ThreadPoolExecutor es=(ThreadPoolExecutor)Executors.newCachedThreadPool();
		ThreadPoolExecutor es=(ThreadPoolExecutor)Executors.newFixedThreadPool(4);
		//ExecutorService es = Executors.newCachedThreadPool();
		List<Future<Integer>> results;
		ArrayList<AdderTask> threads = new ArrayList<AdderTask>();

		for (int i = 0; i < 10; i++) {
			threads.add(new AdderTask(i, i + 2));
		}

		results = es.invokeAll(threads);

		System.out.println(results.size());
		do {
			for(int i=0;i<results.size();i++) {
				System.out.println("Job Done : "+results.get(i).isDone());
			}
		}while(es.getCompletedTaskCount()<results.size());

		for (Future<Integer> f : results) {
			sum = sum + f.get();
		}

//		results.stream().map(a->{
//			int temp=0;
//			try {
//				temp= a.get();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} catch (ExecutionException e) {
//				e.printStackTrace();
//			}
//			return temp;}).reduce((a,b)->(a+b)).get();

		System.out.println(sum);
		es.shutdown();
	}

}
