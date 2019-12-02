package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DemoFileReader {

	public static void main(String[] args) {

		
		try (FileInputStream fis = new FileInputStream("sample.txt");
				FileOutputStream fos=new FileOutputStream("sample-copy1.txt",true)) {
			int c = 0;
			while (true) {
				int b = fis.read();
				if (b != -1) {
					System.out.print((char) b);
					fos.write(b);
				} else {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
