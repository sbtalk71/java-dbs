package day5.fj2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class AdderTask extends RecursiveTask<Integer> {

	List<Integer> numsList;

	public AdderTask(List<Integer> numsList) {
		this.numsList = numsList;
	}

	@Override
	protected Integer compute() {
		int sum = 0;
		if (numsList.size() > 2) {
			AdderTask t1 = new AdderTask(numsList.subList(0, numsList.size()/2));
			AdderTask t2 = new AdderTask(numsList.subList(numsList.size() / 2, numsList.size()));
			t1.fork();
			t2.fork();
			sum = t1.join() + t2.join();
		} else {
			for (Integer x : numsList) {
				sum = sum + x;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		ForkJoinPool fjp=new ForkJoinPool(2);
		List<Integer> numsList=new ArrayList<Integer>();
		
		for(int i=1;i<21;i++) {
			numsList.add(i);
		}
		
		AdderTask task=new AdderTask(numsList);
		int sum=fjp.invoke(task);
		System.out.println(sum);
	}
}
