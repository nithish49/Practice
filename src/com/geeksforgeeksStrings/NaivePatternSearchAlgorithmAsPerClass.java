package com.geeksforgeeksStrings;

import java.util.Scanner;

public class NaivePatternSearchAlgorithmAsPerClass {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String pattern=sc.nextLine();
		int n=text.length();
		int m=pattern.length();
		
		for(int i=0;i<=n-m;i++)
		{
			int j=0;
			for(j=0;j<m;j++)
			{
				if(pattern.charAt(j)!=text.charAt(i+j))
				{
					break;
				}
			}
			if(j==m)
			{
				System.out.println(i);
			}
		}
		
	}
	
}
