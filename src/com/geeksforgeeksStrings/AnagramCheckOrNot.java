package com.geeksforgeeksStrings;

import java.util.Scanner;

public class AnagramCheckOrNot {
	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = "hello";//scan.next();
        String b = "elloH";//scan.next();
        scan.close();
        boolean ret = Anagram.isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

class Anagram{    
    /*  Function to check if two strings are anagram
    *   c, d: input string
    */
    static final int CHAR=256;
    public static boolean isAnagram(String c,String d)
    {
        
        // Your code here
        c=c.toLowerCase();
	    d=d.toLowerCase();
		 if(c.length()!=d.length())
			 return false;
		 
		 int ch[]=new int[CHAR];
		 for(int i=0;i<c.length();i++)
		 {
			 ch[c.charAt(i)]++;
			 ch[d.charAt(i)]--;
		 }
		 
		 for(int i=0;i<CHAR;i++)
		 {
			 if(ch[i]!=0)
				 return false;
		 }
		 return true;
    }
}