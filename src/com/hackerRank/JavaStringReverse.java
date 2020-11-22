package com.hackerRank;

import java.util.Scanner;

public class JavaStringReverse {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String res="";
        /* Enter your code here. Print output to STDOUT. */
        for(int i=A.length()-1;i>=0;i--)
        {
             res+=A.charAt(i);
        }
        if(A.equals(res))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
