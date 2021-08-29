package com.Bridgelabs.Ds;

public class unOrderedList<K> {
	private INode head;
	private INode tail;

	public void search(K key) {
		INode<K> tempNode = head;
		while (tempNode != null) {
			K a = tempNode.getkey();
			if (a.equals(key)) {
				System.out.println(tempNode.getkey());
			}
			tempNode = tempNode.getNext();
		}
		System.out.println(key + " not present");
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

	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList<>();

		String str = " England were quiet, technically pedantic, crafty, "
				+ "and not exactly eager for a brawl. Were. One might find it hard "
				+ "to believe that Joe Root's team weren't themselves surprised by the"
				+ " manner in which they annihilated India.Hello Nevertheless, the one boring thing"
				+ " about Test cricket is that flukes are unlikely";
		String[] old = str.split(" ");
		String a = "Hello";
		boolean bool = false;
		for (int i = 0; i < old.length; i++) {
			if (old[i].equals(a)) {
				ll.delete(a);
			} else {
				ll.append(new MyNode(old[i]));
				bool = true;
			}
		}
		if (bool == true) {
			ll.append(new MyNode(a));
		}
		ll.print();
		System.out.println();
	}
}
