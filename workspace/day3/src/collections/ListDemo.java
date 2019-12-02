package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListDemo {

	public static void main(String[] args) {
		//List<String> names=new CopyOnWriteArrayList<String>();
		List<String> names=new ArrayList<String>();
		names.add("Scott");
		names.add("Pavan");
		names.add("Srikanth");
		names.add("Rita");
		names.add("Pavan");
		names.add("Karan");
		
		
		Collections.sort(names, (x,y)->y.compareTo(x));
		
		//System.out.println(names.get(3));
		
		System.out.println(names);
		
		names.add(3, "kamal");
		
		System.out.println(names);
		
		//names.remove(5);
		
		System.out.println(names);
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			
			String name=itr.next();
			System.out.println("Welcome "+name);
		}
		
		/*
		 * List<String> names2=Collections.synchronizedList(names);
		 * 
		 * for(String name:names2) { if(name.equals("Pavan")) { names2.remove(name); } }
		 */

		//System.out.println(names2);
		
		
		Integer x=10;
	}

}
