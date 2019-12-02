package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("Scott");
		names.add("Pavan");
		names.add("Srikanth");
		names.add("Rita");
		names.add("pavan");
		names.add("Karan");
		
		
		
		System.out.println(names);
		
		
		
		
		names.remove("pavan");
		
		System.out.println(names);
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			
			String name=itr.next();
			System.out.println("Welcome "+name);
		}
		
		
		
		for(String name:names) {
			if(name.equals("Pavan")) {
				names.remove(name);
			}
		}

		System.out.println(names);
	}

}
