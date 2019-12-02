package day5.fj2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class StringLengthTask extends RecursiveAction {

	List<String> names;
	
	public StringLengthTask(List<String> names) {
		this.names = names;
	}

	@Override
	protected void compute() {
		if(names.size()>2) {
			StringLengthTask t1=new StringLengthTask(names.subList(0, names.size()/2));
			StringLengthTask t2=new StringLengthTask(names.subList((names.size()/2),names.size()));
			t1.fork();
			t2.fork();
			t1.join();
			t2.join();
			
		}else {
			for(String name:names) {
				System.out.println(name+" : "+name.length());
			}
		}

	}

	public static void main(String[] args) {
		ForkJoinPool fjp=new ForkJoinPool();
		
		List<String> names=Arrays.asList("Raja","Guru","Shantanu","Pavan","Manik","Chethan","Kiran");
		
		fjp.invoke(new StringLengthTask(names));
		
	}
}
