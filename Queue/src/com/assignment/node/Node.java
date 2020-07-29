package com.assignment.node;

public class Node<E> {
	private E data;
	private Node next;

	public Node(E data) {
		this.data = data;
		next = null;
	}

	public E getData() {
		return data;
	}

	public E setData(E data) {
		return this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}

