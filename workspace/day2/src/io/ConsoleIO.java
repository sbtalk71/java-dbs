package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleIO {

	public static void main(String[] args) throws Exception{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String line="";
		System.out.println("Enter 'quit' to exit..");
		while(!(line=br.readLine()).equals("quit")) {
			System.out.println(line);
		}

	}

}
