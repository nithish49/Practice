package com.hackerRank.ProblemSolving;

import java.util.Scanner;

public class StairCase {
	// Complete the staircase function below.
    static void staircase(int n) {
        for(int i=0;i<n;i++)
        {
        	int j=0;
             for(j=i;j<n-1;j++)
                 System.out.print(" ");
             for(int k=(n-(j-i));k>0;k--)
            	 System.out.print("#");
             System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
