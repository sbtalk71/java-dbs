package com.demo.server;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws Exception{
		ServerSocket server=new ServerSocket(8282);
		System.out.println("Waiting for request...");
		Socket sc=server.accept();
		
		DataInputStream dis=new DataInputStream(sc.getInputStream());
		FileOutputStream fos=new FileOutputStream("done.txt");
		try {
		while(true) {
			int b=dis.read();
			fos.write(b);
			System.out.print((char)b);
		}
		}catch(Exception e) {
			System.out.println("Done!");
		}
	}

}
