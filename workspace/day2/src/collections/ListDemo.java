package collections;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Raju");
		list.add("Rita");
		list.add("Kethan");
		//list.add(1000);
		list.add("Seema");
		
		for(Object s:list) {
			System.out.println((String)s);
		}

	}

}
