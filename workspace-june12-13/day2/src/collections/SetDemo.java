package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> names=new HashSet<String>();
		names.add("Dev");
		names.add("Parinita");
		names.add("Kirthi");
		names.add("Chandra");
		names.add("Ranga");
		
		
		//names.add(0, "Puja");
		names.add("Parinita");
		System.out.println(names);

		//names.remove(3);
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
