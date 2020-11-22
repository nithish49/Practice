package com.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java_List {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        
        List<Integer> arList=new ArrayList<Integer>();
        int N=scan.nextInt();

        for(int i=0;i<N;i++)
        {
        	int a=scan.nextInt();
        	arList.add(a);
        }
        
        int Q=scan.nextInt();
        
        for(int i=0;i<Q;i++)
        {
        	String s=scan.next();
        	if(s.equals("Insert"))
        	{
        		int ind=scan.nextInt();
        		int value=scan.nextInt();
        		if(ind>=arList.size())
        			arList.add(value);
        		else
        		{
        			arList.add(ind, value);
        		}
        			
        		
        	}
        	else if(s.equals("Delete"))
        	{
        		int deleteindex = scan.nextInt();
        		arList.remove(deleteindex);
        	}
        }
        
    	System.out.print(arList.get(0));
        for(int i=1;i<arList.size();i++)
        {
        	System.out.print(" ");
        	System.out.print(arList.get(i));
        	
        }
        
    }
}
