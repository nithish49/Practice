package com.hackerRank.ThirtyDaysCode;


import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Day_Fifteen_LinkedList {

    public static  Node insert(Node head,int data) {
        //Complete this method
    	if(head==null)
    	{
    		Node node=new Node(data);
    		return node;
    	}
        Node start = head;
        while(start.next != null) {
            start = start.next;
        }
        Node node=new Node(data);
        start.next=node;    
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}


