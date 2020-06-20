package com.demo.server;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) throws Exception{
		
		Socket sc = new Socket("localhost", 8282);
		FileInputStream fis=new FileInputStream("demo.txt");
		DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
		System.out.println("Sending file to Server..");
		int b=0;
		while((b=fis.read())!=-1) {
			dos.write(b);
			dos.flush();
		}
		
		System.out.println("Sending file to Server..");
		
		

	}

}
