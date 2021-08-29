package com.Bridgelabs.Ds;

import java.util.Scanner;

public class orderedList<K> {
	INode<K> head;
	INode<K> tail;
	
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

	public void delete(int num) {
		INode<K> tempNode = head;
		if (tempNode.equals(num)) {
			head = tempNode.getNext();
			tempNode.setNext(tempNode.getNext());
		} else {
			while (tempNode != null) {
				if (tempNode.getNext().equals(num)) {
					if (tempNode.getNext().equals(tail)) {
						tail = tempNode;
						tempNode.setNext(null);
						break;
					}
					tempNode.setNext(tempNode.getNext().getNext());
					break;
				}
				tempNode = tempNode.getNext();

			}
		}
	}

	public void searchNode(String myNode) {
		INode<K> tempNode = head;
		if (tempNode.equals(myNode)) {
			System.out.println(myNode + "is found");

		} else {
			while (tempNode != null) {
				if (tempNode.equals(myNode)) {
					System.out.println(myNode + " is found");
					break;

				}
				tempNode = tempNode.getNext();
			}
			if (tempNode == null) {
				INode<K> temp = new MyNode(myNode);
				tail.setNext(temp);
				tail = temp;
			}
			this.print();
		}

	}

	public void sortArray(Integer arr[]) {
		int size = arr.length;
		int temp;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public void remove(Integer[] arr, int num)
	{
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == num)
				this.delete(num);
			else 
				this.add(new MyNode(num));
		}
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
	public static void main(String[] args) {
		orderedList<Integer> ol= new orderedList<Integer>();
		Integer[]  arr= {1,2,3,4,5,4,3,2,1};
		ol.sortArray(arr);
		ol.print();
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		ol.remove(arr, number);
		ol.print();
		
	}

}
