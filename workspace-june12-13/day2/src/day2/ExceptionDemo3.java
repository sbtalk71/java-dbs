package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("demo.txt");

			fis.read();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		
		try (FileInputStream fis1 = new FileInputStream("demo.txt");) {

			fis1.read();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
