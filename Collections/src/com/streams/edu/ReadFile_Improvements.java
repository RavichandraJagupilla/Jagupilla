package com.streams.edu;

import java.io.*;
public class ReadFile_Improvements {

	public static void main(String[] args) throws IOException {
		//attach the file to FileInputStream
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter File name");
				String fname=br.readLine();
				FileInputStream fin=null;
				// check if file exists are not.
				try
				{
					fin= new FileInputStream(fname);
				}catch(FileNotFoundException fe)
				{
					System.out.println("File not found");
					return;
				}
				//attach fileinputstream to BufferedInputStream
				 BufferedInputStream bin = new BufferedInputStream(fin);
				
				System.out.println("File Contents");

				// read the character from the FileInputStream and write 
				// them to monitor. Repeat until the end of file.
				
				int ch;
				while((ch=bin.read())!=-1)
				{
					System.out.print((char)ch);
				}
				// close the file.
				bin.close();

	}

}
