/*
1
hello world
aaa writer
50
2
World cup
bbb writer
55
3
Planet earth
ccc writer
45
4
India's history
ddd writer
40  */

package com.examples.edu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8 {
	static int count=0;
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        Book[] b = new Book[4];
        for(int i=0;i<b.length;i++)
        {
            int id=sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            int price = sc.nextInt();
            b[i] =new Book(id,title,author,price);
        }
      sc.nextLine();
        String ti = sc.nextLine();
        //System.out.println("Hi taken data");
        Book[] arr1= searchTitle(b,ti);
       // System.out.println("Hi search data");
      // Arrays.sort(arr1,new Bhanu());
       // System.out.println("After sort");
       // System.out.println(arr[0].getId());
        for(int i=0;i<count;i++)
        {
        	//System.out.println("Hi in loop");
        System.out.println(arr1[i].getId());
        }

    }


    public static  Book[] searchTitle(Book[] k,String tit)
{
      
    Book[] arr = new Book[4]; 
   //System.out.println(tit);
    for(int u=0;u<k.length;u++)
    {
    	
		StringTokenizer str= new StringTokenizer(k[u].getTitle(), " ");
    	//System.out.println(k[u].getTitle());
		while (str.hasMoreElements()) {
			String s1=str.nextToken();
			if (s1.equalsIgnoreCase(tit))
			{
			arr[count]= k[u];
			count++;
				
			}
			
		}
    
    	
    }
    
    return arr;

}
}
class Bhanu implements Comparator<Book>
{
	public int compare(Book d1,Book d2)
	{
		return d1.getId()-d2.getId();
	}

}
    class Book
{
     private int id;
     public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    private String title;
     private String author;
     private int price;
     public Book(int id,String title,String author,int price)
     {
         this.id=id;
         this.title= title;
         this.author= author;
         this.price= price;
     }
}