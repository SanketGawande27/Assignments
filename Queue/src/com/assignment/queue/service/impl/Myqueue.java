package com.assignment.queue.service.impl;
import java.util.Scanner;

import com.assignment.customexceptions.MyException;
import com.assignment.node.Node;

public class Myqueue {
   
	 private Node rear;
	 private Node front;
	 private int size;
	int del;
	
	private Node ptr; 
	 
	 public Myqueue() {
		 front = null;
		 rear=null;
		 size=0;
	 }
	 
	 public boolean isEmpty() {
		 boolean res = false;
		 if (size == 0) {
			 res = true;
		 }
		 return res;
	 }
	
	 public void insert() {
		 Scanner sc = new Scanner(System.in);
		 int element = sc.nextInt();
		 Node node = new Node(element);
		   if(front == null) {
			   rear = node;
			   front = node;
			   size++;
		   }
		   else {
			   rear.setNext(node);
			   rear = node;
			   size++;
			
		   }
	 }
	 
	
	 public int delete() throws MyException {
	     	   if(isEmpty())
	    	     throw new MyException("Queue is Already Empty Not Been Deleted......\nPlease Insert Elements First ....");
	    	   Node ptr = front;
	    	   front = ptr.getNext();
	    	    if(front==null)
	    	    	 rear = null;
	    	     size--;     
		      return ptr.getData();  	   	
     }
	   
	    public int size() {
	    	return size;
	    }
	    
	    
	    
	    public String display() throws MyException {
	    	
	    	if(front == null && rear == null )
	    		throw new MyException("Queue is Empty ....");
	    	else {
	    		Node ptr= front;
	    		while(ptr!=rear.getNext()) {
	    			System.out.print(ptr.getData()+"  ");
	    			ptr = ptr.getNext();
	    			//return ptr.toString();
	    		}
	    		
	    	}
		return ptr.toString();
	    	
	    }
}
