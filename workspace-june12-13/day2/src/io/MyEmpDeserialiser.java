package io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import day2.Employee;
import day2.Person;


public class MyEmpDeserialiser {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis=new FileInputStream("emp.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
//		Object o=ois.readObject();
//		
//		System.out.println(o.getClass().getName());
//		
		try {
		while(true) {
		Person e1=(Person)ois.readObject();
		
		System.out.println(e1.getId()+" "+e1.getName());
		}
		}catch(EOFException e) {
			System.out.println("DONE!");
		}

	}

}
