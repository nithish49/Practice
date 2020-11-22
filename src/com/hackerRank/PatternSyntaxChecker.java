package com.hackerRank;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {

	
	
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0 && in.hasNextLine()){
			String pattern = in.nextLine();
          	//Write your code
			try
			{
				if(Pattern.compile(pattern) != null)
					System.out.println("Valid");
			}
			catch(Exception e)
			{
				System.out.println("Invalid");
				continue;
			}
		}
	}
}
