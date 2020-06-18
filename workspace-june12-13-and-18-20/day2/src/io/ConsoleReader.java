package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter 'exit' to quit..");
//		while(true) {
//			int data=br.read();
//			char ch=(char)data;
//			if(ch=='q') break;
//			System.out.print(ch);
//		}
		
		String input="";
		
		while(!(input=br.readLine()).equals("exit")) {
			System.out.println(input);
		}

	}

}
