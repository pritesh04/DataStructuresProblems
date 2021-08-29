package com.Bridgelabs.Ds;

public class MyLinkedList<K> {

	private INode head;
	private INode tail;

	// Uc2
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

	// Uc3
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

	public void delete(K myNode) {
		INode<K> tempNode = head;
		while (tempNode != null) {
			if (tempNode.getNext().getkey().equals((K) myNode)) {
				INode<K> temp = tempNode.getNext().getNext();
				tempNode.setNext(temp);
				break;
			}
			tempNode = tempNode.getNext();
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

	// Uc5
	public void deleteFirstElement() {

		INode tempNode = null;
		tempNode = head;
		head = head.getNext();
		System.out.println("deleted " + tempNode.getkey());
		tempNode = null;

	}

	// Uc6
	public void deleteLastElement() {
		INode t1 = head, t2 = head;
		while (t2 != tail) {
			t1 = t2;
			t2 = t2.getNext();
		}
		tail = t1;
		System.out.println("Deleted the last element " + t2.getkey());
		t2 = null;

	}

	// Uc7
//	public INode<K> search(K key) {
//		INode t1 = head;
//		boolean flag = false;
//		while (t1 != null) {
//			if (t1.getkey() == key) {
//				flag = true;
//				break;
//			}
//			t1 = t1.getNext();
//
//		}
//		if (flag) {
//			System.out.println(" Key found");
//		} else {
//			System.out.println("key not found");
//		}
//		return null;
//
//	}

	public void search(K key) {
		INode<K> tempNode = head;
		while (tempNode != null) {
			K a= tempNode.getkey();
			if (a.equals(key)) {
				System.out.println( tempNode.getkey());
			}
			tempNode = tempNode.getNext();
		}
		System.out.println( key + " not present");
	}

	// Uc9
	public void deleteInBetween(INode y) {
		INode temp, t = head;
		temp = head;
		while (!temp.equals(y)) {
			t = temp;
			temp = temp.getNext();
		}
		t.setNext(temp.getNext());
		System.out.println("Deleted " + temp.getNext());
		//temp = null;
	}

	// Uc8 //Uc4
	public void insertSpecific(INode old, INode newNode) {
		INode temp = head, t = head;
		while (!temp.equals(old)) {
			t = temp;
			temp = temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);

		// newNode.setNext(newNode.getNext());
		// System.out.println(newNode.getNext());
//		
//		temp.setNext(newNode.getNext());
//		temp.setNext(newNode);
//		System.out.println(newNode.getNext());

	}
	
	
	@Override
	public String toString() {
		return "" + head;
	}

}
