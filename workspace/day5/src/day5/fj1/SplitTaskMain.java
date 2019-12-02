package day5.fj1;

import java.util.concurrent.ForkJoinPool;

public class SplitTaskMain {

	public static void main(String[] args) {
		ForkJoinPool fjp=new ForkJoinPool();
		MySplitTask task=new MySplitTask(400);
		fjp.invoke(task);
		

	}

}
