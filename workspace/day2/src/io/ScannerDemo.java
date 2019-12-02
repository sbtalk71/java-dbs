package io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 'quit' to exit");
		String line = "";

		while (true) {
			line = sc.next();
			if (!line.equals("quit")) {
				System.out.println(line);
			} else {
				break;
			}

		}

	}

}
