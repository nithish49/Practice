package com.hackerRank.ProblemSolving;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class plusMinus {
	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		int positiveOccurences = 0;
		int negativeOccurences = 0;
		int zeroOccurences = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				positiveOccurences++;
			else if (arr[i] < 0)
				negativeOccurences++;
			else
				zeroOccurences++;
		}
		// double posOccu=positiveOccurences/arr.length;
		// double negOccu=negativeOccurences/arr.length;
		// double zeroOcc=zeroOccurences/arr.length;

//		double num = (double) (positiveOccurences / arr.length);
//		DecimalFormat df = new DecimalFormat("#.###");
//		df.setRoundingMode(RoundingMode.CEILING);

		getInegral(positiveOccurences,arr.length);
		//BigDecimal num = new BigDecimal(positiveOccurences/arr.length);
		//System.out.println(num);

		// System.out.format("%.6f",negativeOccurences/arr.length);
		// .out.format("%.6f",zeroOccurences/arr.length);

	}

	
	  static void getInegral(int x,int y){ 
		  int scale = 10000;
		  BigDecimal num1 = new BigDecimal(x);
		  BigDecimal num2 = new BigDecimal(y);
		  System.out.println(num1.divide(num2, scale,RoundingMode.HALF_UP).toString());
		  
	  }
	  

	 

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
