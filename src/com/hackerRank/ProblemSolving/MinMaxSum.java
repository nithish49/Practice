package com.hackerRank.ProblemSolving;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        long sum=0;
        long newarr[]=new long[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        for(int i=0;i<newarr.length;i++)
        {
            newarr[i]=sum-arr[i];
        }
        Arrays.sort(newarr);
        System.out.print(newarr[0]+" ");
        System.out.print(newarr[newarr.length-1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
