package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmailSerializer {

	public static void main(String[] args) {

		try (	FileOutputStream fos = new FileOutputStream("email.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream("email.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
			) 
		{
			Email mail = new Email("romeo@everywhere.com", "juliet@somewhere.com", "Just Kidding");
			oos.writeObject(mail);
			System.out.println("The Object is serialized...");

			System.out.println("======Now Deserialization=========");

			Email e = (Email) ois.readObject();
			System.out.println(e.getMail());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
