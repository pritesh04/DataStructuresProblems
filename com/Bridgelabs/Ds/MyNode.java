package com.Bridgelabs.Ds;

public class MyNode<K> implements INode<K> {
	private K key;
	private INode next;

	public MyNode(K key) {

		this.key = key;
		this.next = null;
	}

	@Override
	public String toString() {
		return "MyNode [key=" + key + ", next=" + next + "]";
	}

	@Override
	public K getkey() {
		return key;
	}

	@Override
	public void setKey(K key) {

		this.key = key;
	}

	@Override
	public void setNext(INode next) {
		this.next = next;

	}

	@Override
	public INode getNext() {
		return next;

	}

}
