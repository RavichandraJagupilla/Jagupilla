package com.streams.edu;

import java.io.*;

public class FileReader1 {

	public static void main(String[] args) throws IOException{
		int ch;
		//check if file exists are not
		FileReader fr = null;
		try
		{
			fr= new FileReader("text");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not Found");
			return;
		}
// read the file till the end of file
		while((ch=fr.read())!=-1)
			System.out.print ((char)ch);
	
// close the file
	fr.close();
}
}
