package com.hackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        BigInteger num1=sc.nextBigInteger();
        BigInteger num2=sc.nextBigInteger();
        BigInteger sum = BigInteger.ZERO;
        BigInteger mul = BigInteger.ZERO;
      //  sum.add(num1);
        num1.add(num2);
       // mul.multiply(num1);
        num1.multiply(num2);
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));
	}

}
