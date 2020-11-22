package com.geeksforgeeks;

//{ Driver Code Starts
import java.util.*;

public class RunlengthEncoding
{
public static void main(String[] args) 
{

   Scanner sc = new Scanner(System.in);
 
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		//GfG g = new GfG();
		System.out.println(encode(str));
		
   
     T--;
	  }
}

static String encode(String str)
{
   //Your code here
   String resstr="";
   //Map<Character,Integer> map=new TreeMap<Character,Integer>();
   char ch[]=str.toCharArray();
   char checkchar = ch[0];
   int count=1;
   for(int i=1;i<ch.length;i++)
   {
	   
       if(checkchar==ch[i])
       {
    	   count++;
       }
       else if(checkchar!=0 && checkchar!=ch[i])
       {
    	   resstr+=checkchar+String.valueOf(count);
    	   count=1;
    	   checkchar=ch[i];
       }
   }
   resstr+=checkchar+String.valueOf(count);
   return resstr;
}
}

//} Driver Code Ends



