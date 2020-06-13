package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import day2.Employee;

public class MyEmpSerializer {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("emp.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Employee e=new Employee(100, "Boby", 78000);
		
		oos.writeObject(e);
		
		Employee e1=new Employee(101, "Tinku", 98000);
		oos.writeObject(e1);
		
		System.out.println("The Object Seralised..");
		

	}

}
