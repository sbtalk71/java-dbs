package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		//Map<Integer, Emp> empMap = new HashMap<>();
		//Properties empMap=new Properties();
		//Map<Integer, Emp> empMap=new Hashtable<>();
		Map<Integer, Emp> empMap=new LinkedHashMap<>();
		empMap.put(100, new Emp(100, "Rajesh", "Hyderabad", 45000));
		empMap.put(101, new Emp(101, "Scott", "London", 55000));
		empMap.put(102, new Emp(102, "Ashish", "Bangalore", 65000));
		empMap.put(103, new Emp(103, "Shantanu", "Hyderabad", 35000));
		empMap.put(104, new Emp(104, "Rupa", "Hyderabad", 35000));
		empMap.put(105, new Emp(105, "Chethan", "Delhi", 45000));
		empMap.put(106, new Emp(106, "Kirthi", "Bangalore", 75000));
		empMap.put(107, new Emp(107, "Kamal", "Bangalore", 45000));
		empMap.put(108, new Emp(108, "Manoj", "Hyderabad", 75000));
		empMap.put(109, new Emp(109, "Ramesh", "Hyderabad", 65000));

		Emp e1=(Emp)empMap.get(100);
		System.out.println(e1.getDetails());
		
		
		Set<Integer> keySet=empMap.keySet();
		for(Integer i:keySet) {
			System.out.println(empMap.get(i).getDetails());
		}
		
		Collection<Emp> emps=empMap.values();
		
		for(Emp e:emps) {
			System.out.println(e.getDetails());
		}
	}

}
