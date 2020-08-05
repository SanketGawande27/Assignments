package com.assignment.node;

public class Node<E> {
	private E data, obj;
	private Node<E> next;

	public Node(E data) {
		this.data = data;
		next = null;
	}

	public Node(E data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public E getData() {
		return data;
	}

	public E getobj() {
		return obj;
	}

	public Node<E> getNext() {
		return next;
	}

	public E setData(E data) {
		return this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public E setobj(E obj) {
		return this.obj = obj;
	}

	@Override
	public String toString() {

		return "Node [data=" + data + ", next=" + next + ", obj=" + obj + "]";
	}

}
