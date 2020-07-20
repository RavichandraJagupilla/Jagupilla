package com.streams.edu;

import java.io.*;

public class ReadFile {

public static void main(String[] args)throws IOException {

//attach the file to FileInputStream
FileInputStream fin= new FileInputStream("myfile.txt");
System.out.println("File Contents");

// read the character from the FileInputStream and write 
// them to monitor. Repeat until the end of file.

int ch;
while((ch=fin.read())!=-1)
{
System.out.print((char)ch);
}
// close the file.
fin.close();
}

}

