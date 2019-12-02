package com.demo.fj;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Demo1 {

	public static void main(String[] args) {
		ForkJoinPool pool = ForkJoinPool.commonPool();
		int arr[]= {1,2,3,3,4,5,6,6,7,8,9,8,8,9,8,9,9,8};
		int start=0;
		int end=arr.length-1;
		int searchElem=8;
			
		SearchTask task = new SearchTask(arr,start,end,searchElem);
		Integer result = pool.invoke(task);
		System.out.printf("%d appeared %d times ",searchElem,result);
	}

}

class SearchTask extends RecursiveTask<Integer> {
	int searchArr[];
	int start;
	int end;
	int searchElem;

	public SearchTask(int[] searchArr, int start, int end, int searchElem) {
		this.searchArr = searchArr;
		this.start = start;
		this.end = end;
		this.searchElem = searchElem;
	}

	@Override
	protected Integer compute() {
		System.out.println("compute called with " + Thread.currentThread());
		int size=end-start+1;
		if(size>3) {
			int mid=(end+start)/2;
			SearchTask t1=new SearchTask(searchArr, start, mid, searchElem);
			SearchTask t2=new SearchTask(searchArr, mid+1, end, searchElem);
			t1.fork();
			t2.fork();
			int result=t1.join()+t2.join();
			return result;
			//return t1.join()+t2.compute();
		}else {
		return processSearch();
		}
		
	}

	private Integer processSearch() {
		System.out.println("Process Search Called..");

		int count = 0;
		for (int i = start; i <=end; i++) {
			if (searchArr[i] == searchElem)
				count++;
		}
		return count;
	}
}