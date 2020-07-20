package com.streams.edu;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Createfile_Buffer {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub

		// Attach keyboard to DataInputStream
		DataInputStream dis= new DataInputStream(System.in);
		//attach my file to FileOutputStream
		
		FileOutputStream fout= new FileOutputStream("G:/Online_Core_Java/myfile.txt", true);
		BufferedOutputStream bout= new BufferedOutputStream(fout,1024);
		
		System.out.println("Enter text (@ to end):");
		
		char ch;
		// read the character from dis into ch. Then write them into fout.
		// repeat this as long as read character is not '@'
		
		while ((ch=(char)dis.read( ))!='@') {
			
			bout.write(ch);
			
		}
		// close the file
		bout.close();
	}

}

