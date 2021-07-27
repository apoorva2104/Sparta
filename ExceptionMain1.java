package com.lti.exception;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain1 {

	public static void main(String[] args) throws IOException{
		System.out.println("Main begins");
		fileRead("d:\\Core java notes.txt");
		System.out.println("File not found");
		
	}
   public static void fileRead(String fileName) throws IOException {
	   FileReader reader=new FileReader(fileName);
	   char[] ch=new char[100];
	   reader.read(ch);
	   System.out.println(ch);
   }
}
