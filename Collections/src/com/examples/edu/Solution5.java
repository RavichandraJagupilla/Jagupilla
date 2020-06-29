package com.examples.edu;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Comparator;

public class Solution5 {
	
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Document[] docs = new Document[4];
       	Scanner sc = new Scanner(System.in);
        for(int i=0;i<docs.length;i++)
        {
            int id=sc.nextInt();
            System.out.println(id);
            sc.nextLine();
            String title = sc.nextLine();
            System.out.println(title);
//            sc.nextLine();
            String folderName = sc.nextLine();
             System.out.println(folderName);
            int pages = sc.nextInt();
            System.out.println(pages);
             docs[i] = new Document(id,title,folderName,pages);
        }
        Document[] m = docsWithOddNoOfPages(docs);
       Arrays.sort(m,new UseIt());
        for (int i=0;i<m.length;i++){
            
            System.out.println(m[i].id+" "+m[i].title+" "+m[i].folderName+" "+m[i].pages);
            
        }

        
        
//        int[] arr = {} ;
//        for(int k=0;k<m.length;k++)
//        {
//        	 arr[k] = m[k].getId();
//      }
//        Arrays.sort(arr);
//          
//        
//        
//        for(int j=0;j<arr.length;j++){
//        System.out.println(arr[j].getId()+" "+arr[j].getTitle()+" "+arr[j].getFolderName()+" "+arr[j].getPages());
//        }
    }

    public static Document[] docsWithOddNoOfPages(Document[] d)
    {
    	int count=0;
       
        for(int i=0;i<d.length;i++)
        {
        if((d[i].getPages()%2)!=0)
        {
            count++;

        }
        }
        int b=0;
        Document[] m = new Document[count];
        for(int i=0;i<d.length;i++)
        {
        if((d[i].getPages()%2)!=0)
        {
            m[b]=d[i];
            b++;
        }
        }
        return m;

    }
}

class UseIt implements Comparator<Document>
{
	public int compare(Document d1,Document d2)
	{
		return d1.getId()-d2.getId();
	}

}

class Document
   {
       int id;
       public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFolderName() {
        return folderName;
    }

    public int getPages() {
        return pages;
    }

    String title;
       String folderName;
       int pages;
      
       public Document(int id,String title, String folderName,int pages)
       {
           this.id= id;
            this.title=title;
             this.folderName=folderName;
             this.pages= pages;
       }
   }