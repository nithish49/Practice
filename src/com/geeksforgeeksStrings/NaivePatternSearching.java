package com.geeksforgeeksStrings;

import java.util.Scanner;

public class NaivePatternSearching {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	//	String text="ABABABCD";//sc.nextLine();
	//	String pattern="ABAB";//sc.nextLine();
	//	String text="ABCABCD";//sc.nextLine();
	//	String pattern="ABCD";//sc.nextLine();
		String text="AAAAA";//sc.nextLine();
		String pattern="AAA";//sc.nextLine();
		
		for(int i=0;i<text.length()-1;i++)
		{
			boolean b=false;
			if(text.charAt(i)==pattern.charAt(0))
			{
				b=checkPattern(pattern,text,i);
			}
			if(b)
				System.out.println(i);
		}
		
	}
	
	
	public static boolean checkPattern(String pattern,String text,int index)
	{
		int k=index;
		for(int j=1;j<pattern.length();j++)
		{
			if(!((k+1)>=text.length()) && text.charAt(k+1)==pattern.charAt(j))
			{
				k++;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
}
