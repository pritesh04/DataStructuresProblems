package com.Bridgelabs.Ds;

import java.util.Scanner;

public class palindromeChecker<K> {

	INode<K> head;
	INode<K> tail;
	
	
	public palindromeChecker() {
		this.head = null;
		this.tail = null;	
	}
	public void add(INode myNode) {
		if (tail == null) {
			tail = myNode;
		}
		if (head == null) {
			head = myNode;
		} else {
			INode tempNode = head;
			head = myNode;
			head.setNext(tempNode);
		}

	}
	public void append(INode myNode) {
		if (head == null) {
			head = myNode;
		}
		if (tail == null) {
			tail = myNode;
		} else {

			tail.setNext(myNode);
			tail = myNode;
		}
	}
	public void addFront(INode<K> myNode) {
		this.append(myNode);
	}
	
	public void addRear(INode<K> myNode) {
		this.add(myNode);
	}
	public void print() {
		INode tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.getkey());
			if (!tempNode.equals(tail)) {
				System.out.print("->");
			}
			tempNode = tempNode.getNext();

		}

	}
	public void deleteFront() {

		INode tempNode = null;
		tempNode = head;
		head = head.getNext();
		System.out.println("deleted " + tempNode.getkey());
		tempNode = null;

	}
	public void deleteRear() {
		INode t1 = head, t2 = head;
		while (t2 != tail) {
			t1 = t2;
			t2 = t2.getNext();
		}
		tail = t1;
		System.out.println("Deleted the last element " + t2.getkey());
		t2 = null;

	}
	public static void main(String[] args) {
		 String original, reverse = ""; 
		 palindromeChecker<String> pc= new palindromeChecker<String>();
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number to check if it is a palindrome");  
	      original = in.nextLine();   
	      int length = original.length();   
	      for(int i=0;i<original.length();i++) {
				pc.addRear(new MyNode(original.charAt(i)));
			}
	      
	      if (original.equals(reverse))  
	          System.out.println("Entered string/number is a palindrome.");  
	       else  
	          System.out.println("Entered string/number isn't a palindrome.");   
	    }  
	}



