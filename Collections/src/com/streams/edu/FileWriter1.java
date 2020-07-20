package com.streams.edu;

import java.io.*;
public class FileWriter1 {

	

	public static void main(String[] args) throws IOException {
		// taking string
		
		String str= "This is online java course." + "\nI am a new leaner of Java.";
		//attach to FileWriter
	FileWriter fw=new FileWriter("text");
	
	// read character wise from string and write into FileWriter
	for(int i=0;i<str.length();i++)
	{
		fw.write(str.charAt(i));
	}
 //close the file
	fw.close();
		
		
	}

}
