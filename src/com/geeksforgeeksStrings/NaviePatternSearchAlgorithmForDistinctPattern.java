package com.geeksforgeeksStrings;

import java.util.Scanner;

public class NaviePatternSearchAlgorithmForDistinctPattern {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String pattern=sc.nextLine();
		int n=text.length();
		int m=pattern.length();
		int count=0;
		for(int i=0;i<=n-m;)
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
				count++;
			}
			if(j==0)
			{
				i++;
			}
			else
			{
				i=i+j;
			}
		}
		
	}
}
