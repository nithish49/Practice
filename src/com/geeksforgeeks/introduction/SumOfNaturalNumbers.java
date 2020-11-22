package com.geeksforgeeks.introduction;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		int N=scan.nextInt();
		int sum=0;
		for(int i=1;i<=N;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}

}
