package com.hackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JavaStringTokens {

	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = "He is a very very good boy, isn't he?";//scan.nextLine();
	        // Write your code here.
	        
	        String delim = "[\\[ .,\\?!@\\]\\+']";	        
	        String[] words = s.split(delim);
	    
	        int count=0;
	        for(String word: words)
	        {
	        	if(word.matches(".*[a-zA-Z].*"))
	        		count++;
	        }
	        System.out.println(count);
	        for(String word: words)
	        {
	        	
	        	if(word.matches(".*[a-zA-Z].*"))
	        		System.out.println(word);
	        }
	        
	        scan.close();
	    }
}
