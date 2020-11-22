package com.hackerRank;

import java.util.Scanner;

public class Java_Regex {
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex
{
	final String  pattern ="^([0-2]{1}?)+([0-5]{1}?)+([0-5]{1}?))";
}