package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		//ArrayList<String> names=new ArrayList<String>();
		//List<String> names=new ArrayList<String>();
		List<String> names=new LinkedList<String>();
		names.add("Dev");
		names.add("Parinita");
		names.add("Kirthi");
		names.add("Chandra");
		names.add("Ranga");
		
		
		names.add(0, "Puja");
		names.add("Parinita");
		System.out.println(names);

		names.remove(3);
		System.out.println(names);
		
		names.remove("Ranga");
		
		System.out.println(names);
		System.out.println(names.contains("Puja"));
		
		
	//	Iterator<String> itr=names.iterator();
		
//		while(itr.hasNext()) {
//			String name=itr.next();
//			System.out.println(name);
//		}
//		

		for(String name:names) {
			System.out.println(name);
		}
		
		
	}

}
