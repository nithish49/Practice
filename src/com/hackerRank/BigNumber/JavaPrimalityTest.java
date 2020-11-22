package com.hackerRank.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        int count=2;
        BigInteger n=new BigInteger(s);
        //int n=Integer.parseInt(s);
        if(n==BigInteger.valueOf(2))
            System.out.println("prime");
        else
        {
        	for(BigInteger i=BigInteger.valueOf(2);(i.compareTo(n.divide(BigInteger.valueOf(2)))==1);i.add(BigInteger.ONE))
            {
                    if(n.divideAndRemainder(i)[1]==BigInteger.ZERO)
                        count++;        			
            }
            if(count==2)
            {
                System.out.println("prime");
            }
            else
            {
            	System.out.println("not prime");
            }
        }
        
        scanner.close();
    }
}
