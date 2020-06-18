package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyFileReader {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis=new FileInputStream("demo.txt");
		BufferedInputStream br=new BufferedInputStream(fis);
		
		FileOutputStream fos=new FileOutputStream("demo_1.txt",true);
		
		BufferedOutputStream bo=new BufferedOutputStream(fos);
		
		while(true) {
			int data=br.read();
			if(data==-1) break;
			bo.write(data);
			System.out.print((char)data);
		}

	}

}
