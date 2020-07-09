package com.streams.edu;

import java.io.*;
public class CreateFile {

	
	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub

		// Attach keyboard to DataInputStream
		DataInputStream dis= new DataInputStream(System.in);
		//attach my file to FileOutputStream
		
		FileOutputStream fout= new FileOutputStream("C:/Users/Welcome/myfile.txt");
		
		System.out.println("Enter text (@ to end):");
		
		char ch;
		// read the character from dis into ch. Then write them into fout.
		// repeat this as long as read character is not '@'
		
		while ((ch=(char)dis.read())!='@') {
			
			fout.write(ch);
			
		}
		// close the file
		fout.close();
	}

}
