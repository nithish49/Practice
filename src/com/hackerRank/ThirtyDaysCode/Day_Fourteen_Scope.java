package com.hackerRank.ThirtyDaysCode;

import java.util.Arrays;
import java.util.Scanner;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

  	Difference(int[] elements)
  	{
  		this.elements=elements;
  	}
  	
	// Add your code here
  	void computeDifference()
  	{
  		int[] ar=this.elements;
  		Arrays.sort(ar);
  		int abs=Math.abs(ar[0]-ar[ar.length-1]);
  		maximumDifference=abs;
  	}

} // End of Difference class


public class Day_Fourteen_Scope {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        sc.close();

	        Difference difference = new Difference(a);

	        difference.computeDifference();

	        System.out.print(difference.maximumDifference);
	    }
	
}
