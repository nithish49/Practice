package com.hackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaAnagramsFix {

	static final int CHAR=256;
	
	 static boolean isAnagram(String c, String d) {
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

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = "hello";//scan.next();
	        String b = "elloH";//scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }

}
