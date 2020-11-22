package com.hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagramsWithoutMap {
	 static boolean isAnagram(String c, String d) {
	        // Complete the function
		 if (c.length() != d.length())
		        return false;
		         
		    int count = 0;
		 
		    // Take sum of all characters of
		    // first String
		    for(int i = 0; i < c.length(); i++)
		    {
		        count = count + c.charAt(i);
		    }
		 
		    // Subtract the Value of all the characters
		    // of second String
		    for(int i = 0; i < d.length(); i++)
		    {
		        count = count - d.charAt(i);
		    }
		 
		    // If Count = 0 then they are anagram
		    // If count > 0 or count < 0 then 
		    // they are not anagram
		    return (count == 0);
	    }

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
}
