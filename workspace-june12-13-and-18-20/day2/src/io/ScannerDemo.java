package io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 'exit' to quit..");
		while (true) {
			String input = sc.next();
			if (input.contentEquals("exit"))
				break;
			System.out.println(input);
		}

	}

}
