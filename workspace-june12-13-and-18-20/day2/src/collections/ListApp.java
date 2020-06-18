package collections;

import java.util.ArrayList;
import java.util.List;

import day2.Employee;

public class ListApp {

	public static void main(String[] args) {
		
		List<Employee> emps=new ArrayList<Employee>();
		emps.add(new Employee(100, "Charan", 60000));
		emps.add(new Employee(101, "Chatur", 67000));
		emps.add(new Employee(102, "Rajan", 77000));
		emps.add(new Employee(103, "Arun", 87000));
		emps.add(new Employee(104, "Vimal", 67000));
		emps.add(new Employee(105, "Chaya", 60000));
		emps.add(new Employee(106, "Kiran", 57000));
		emps.add(new Employee(107, "Dev", 90000));
		emps.add(new Employee(108, "sumit", 88000));
		emps.add(new Employee(109, "suman", 67000));

		for(Employee e:emps) {
			if(e.getName().startsWith("Ch")) {
				System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
			}
		}
		
	}

}
