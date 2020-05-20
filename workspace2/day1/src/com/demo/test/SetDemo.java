package com.demo.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		List<String> namesSet=new ArrayList<String>();
		
		namesSet.add("Shantanu");
		namesSet.add("Amith");
		namesSet.add("Pavan");
		namesSet.add("Chandra");
		namesSet.add("Shekhar");
		namesSet.add("Amith");
		namesSet.add("Guru");
		
		System.out.println(namesSet);
		
		Iterator<String> itr=namesSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		namesSet.remove(6);
		
		for(String name:namesSet) {
			System.out.println(name);
		}
		

	}

}
