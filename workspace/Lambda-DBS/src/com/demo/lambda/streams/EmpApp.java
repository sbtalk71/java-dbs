package com.demo.lambda.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.demo.lambda.Emp;

public class EmpApp {

	public static void main(String[] args) {
		Set<Emp> empSet = new HashSet<>();
		empSet.add(new Emp(100, "Rajesh", "Hyderabad", 45000));
		empSet.add(new Emp(101, "Scott", "London", 55000));
		empSet.add(new Emp(102, "Ashish", "Bangalore", 65000));
		empSet.add(new Emp(103, "Shantanu", "Hyderabad", 35000));
		empSet.add(new Emp(104, "Rupa", "Hyderabad", 35000));
		empSet.add(new Emp(105, "Chethan", "Delhi", 45000));
		empSet.add(new Emp(106, "Kirthi", "Bangalore", 75000));
		empSet.add(new Emp(107, "Kamal", "Bangalore", 45000));
		empSet.add(new Emp(108, "Manoj", "Hyderabad", 75000));
		empSet.add(new Emp(109, "Ramesh", "Hyderabad", 65000));
		
		//List all employees from Bangalore
		SalaryFilter sf=new SalaryFilter();
		//empSet.stream().filter(t->t.getSalary()<50000).map(e->{e.setSalary(e.getSalary()+2000.0);return e;}).forEach(System.out::println);
		
		empSet.parallelStream().filter(t->t.getSalary()<50000).map(e->{e.setSalary(e.getSalary()+2000.0);return e;}).forEach(System.out::println);
		System.out.println(empSet.stream().map(e->e.getSalary()).reduce((a,b)->a+b).get());
		
		List<Integer> nums=Arrays.asList(1,2,30,4,6,8,9,11);
		System.out.println(nums.stream().max((x,y)->x.compareTo(y)).get());

	}

	
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1.compareTo(o2);
	}
}

class SalaryFilter implements Predicate<Emp>{

	@Override
	public boolean test(Emp t) {
		
		return t.getSalary()<50000;
	}
	
}
