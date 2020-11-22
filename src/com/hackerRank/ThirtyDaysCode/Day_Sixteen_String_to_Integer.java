package com.hackerRank.ThirtyDaysCode;

import java.util.Scanner;

public class Day_Sixteen_String_to_Integer {
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        try
	        {
	            int i=Integer.parseInt(S);
	           
	            	System.out.println(i);
	            
	        }
	        catch(Exception e)
	        {
	            System.err.println("Bad String");
	        }
	        
	    }
}
