package io;

import java.io.FileReader;
import java.io.FileWriter;

public class MyFileReader2 {

	public static void main(String[] args) throws Exception{
		
		FileReader fis=new FileReader("demo.txt");
		FileWriter fos=new FileWriter("demo_2.txt",true);
		
		while(true) {
			int data=fis.read();
			if(data==-1) break;
			fos.write(data);
			fos.flush();
			System.out.print((char)data);
		}

	}

}
