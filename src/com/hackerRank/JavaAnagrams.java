package com.hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {
	 static boolean isAnagram(String a, String b) {
	        // Complete the function
		 char[] ach=a.toCharArray();
		 char[] bch=b.toCharArray();
		 Map<Character,Integer> mapString=new HashMap<Character,Integer>();
		 Map<Character,Integer> mapString1=new HashMap<Character,Integer>();
		 for(Character c:ach)
		 {
			 if(mapString.containsKey(Character.toLowerCase(c)))
				 mapString.put(Character.toLowerCase(c), mapString.get(c)+1);
			 else
				 mapString.put(Character.toLowerCase(c), 1);		
		 }

		 for(Character c:bch)
		 {
			 if(mapString1.containsKey(Character.toLowerCase(c)))
				 mapString1.put(Character.toLowerCase(c), mapString1.get(c)+1);
			 else
				 mapString1.put(Character.toLowerCase(c), 1);		
		 }
		 
		if(a.length()!=b.length())
			return false;
		
		

			int count=mapString.size();
			int testCount=0;
			for(char c:mapString.keySet())
			{
				if(mapString.get(c)==mapString1.get(c))
					testCount++;
				else
					return false;
			}
			if(testCount==count)
				return true;
		 return false;
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
