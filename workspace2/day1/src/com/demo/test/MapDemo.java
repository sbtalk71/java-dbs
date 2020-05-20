package com.demo.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> emps=new HashMap<Integer, String>();
		Hashtable<Integer, String> emps=new Hashtable<Integer, String>();
		emps.put(100, "Shantanu");
		emps.put(102, "Rekha");
		emps.put(103, "geetha");
		emps.put(104, "Chandra");
		
		System.out.println(emps);
		
		Set<Integer> keySet=emps.keySet();
		
		for(Integer empId:keySet) {
			System.out.println(empId+" ---> "+emps.get(empId));
		}
				

	}

}
