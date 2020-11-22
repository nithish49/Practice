package com.hackerRank.ThirtyDaysCode;

import java.util.ArrayList;
import java.util.Scanner;


public class Day_TwentyFour_MoreLinkedLists {
	public static Node removeDuplicates(Node head) {
	      //Write your code here
		ArrayList<Integer> ar=new ArrayList<Integer>();
		 if(head==null)
	           return null;
		 else
		 {
			 Node start=head;
			 ar.add(start.data);
	            while(start.next.next!=null)
	            {
	                if(ar.contains(start.next.data))
	                {
		               Node temp=start.next.next;
		               start.next=temp;
	                }
	                else
	                {
	                	ar.add(start.next.data);
		                start=start.next;
	                }
	            }
	            if(start.next!=null)
	            {
	            	if(!(ar.contains(start.data)))
	                {
	                	ar.add(start.next.data);
	                }
	            	
	            		start=start.next;
	            }
		 }
		 return head;
	    }

		 public static  Node insert(Node head,int data)
	     {
	        Node p=new Node(data);			
	        if(head==null)
	            head=p;
	        else if(head.next==null)
	            head.next=p;
	        else
	        {
	            Node start=head;
	            while(start.next!=null)
	                start=start.next;
	            start.next=p;

	        }
	        return head;
	    }
	    public static void display(Node head)
	        {
	              Node start=head;
	              while(start!=null)
	              {
	                  System.out.print(start.data+" ");
	                  start=start.next;
	              }
	        }
	        public static void main(String args[])
	        {
	              Scanner sc=new Scanner(System.in);
	              Node head=null;
	              int T=sc.nextInt();
	              while(T-->0){
	                  int ele=sc.nextInt();
	                  head=insert(head,ele);
	              }
	              head=removeDuplicates(head);
	              display(head);

	       }
}
