package com.hackerRank;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
//        String ar[]=new String[s.length()];
//        for(int i=0;i<(s.length()-k);i++)
//        {
//            ar[i]=s.substring(i,i+k);
//        }
//       
//        smallest=ar[0];
//        largest=ar[ar.length-1];
        Set<String> set=new TreeSet<String>();
        
     //   set=generateSubStrings(set,s);
        
        return smallest + "\n" + largest;
    }

    
    public static String generateSubStrings(String str)
    {
    	Set<String> set=new TreeSet<String>();
    	if(str.length()==0)
    		return "";
    	
    	for(int i=0;i<=str.length();i++)
    	{
    		for(int j=i+1;j<=str.length();j++)
    		{
    			set.add(str.substring(i, j));
    		}
    	}
    	String res="";
    	for(String s:set)
    	{
    		res+=s;
    	}
		return res;
    	
    }

	public static void main (String[] args) {
		String str="cba";
		Set<String> set=new TreeSet<String>();
    	if(str.length()==0)
    		return;
    	
    	for(int i=0;i<=str.length();i++)
    	{
    		for(int j=i+1;j<=str.length();j++)
    		{
    			set.add(str.substring(i, j));
    		}
    	}
    	String res="";
    	for(String s:set)
    	{
    		res+=s;
    	}
    System.out.println(res);
	}
}