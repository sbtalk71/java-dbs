package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import day2.Employee;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,Employee> empDb=new HashMap<>();
		empDb.put(100,new Employee(100, "Charan", 60000));
		empDb.put(101,new Employee(101, "Chatur", 67000));
		empDb.put(102,new Employee(102, "Rajan", 77000));
		empDb.put(103,new Employee(103, "Arun", 87000));
		empDb.put(104,new Employee(104, "Vimal", 67000));
		empDb.put(105,new Employee(105, "Chaya", 60000));
		empDb.put(106,new Employee(106, "Kiran", 57000));
		empDb.put(107,new Employee(107, "Dev", 90000));
		empDb.put(108,new Employee(108, "sumit", 88000));
		empDb.put(109,new Employee(109, "suman", 67000));
		
		System.out.println(empDb);
		
		
		if(empDb.containsKey(109)) {
			Employee e=empDb.get(109);
			System.out.println(e.getId()+" "+e.getName());
		}
		
		Set<Integer> keys=empDb.keySet();
		
		for(Integer i:keys) {
			Employee e=empDb.get(i);
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}

	}

}
