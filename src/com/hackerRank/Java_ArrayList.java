package com.hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_ArrayList {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		ArrayList<ArrayList<Integer>> arListArray=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<N;i++)
		{
			ArrayList<Integer> intArray=new ArrayList<Integer>();
			int ele=scan.nextInt();
			for(int j=0;j<ele;j++)
			{

				int arele=scan.nextInt();
				intArray.add(arele);
			}
			arListArray.add(intArray);
		}
		int Q=scan.nextInt();
		for(int i=0;i<Q;i++)
		{
			int arindex=scan.nextInt();
			int eleIndex=scan.nextInt();
			ArrayList<Integer> intArray=arListArray.get(arindex-1);
			if(eleIndex>intArray.size())
			{
				System.out.println("!ERROR");
			}
			else
			{
				System.out.println(intArray.get(eleIndex-1));				
			}

		}
		
	}
}
