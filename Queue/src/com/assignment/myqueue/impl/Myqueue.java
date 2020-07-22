package com.assignment.myqueue.impl;
import java.lang.Exception;
import java.util.Scanner;

import com.assignment.node.*;
import com.assignment.node.impl.Node;

class Myexception extends Exception{
	public Myexception(String string) {
	  super(string);
	}	 
}

public class Myqueue {
   
	 private Node rear;
	 private Node front;
	 private int size; 
	 
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
		 System.out.print("Enter new element :");
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
	 
	
	    public Node delete() {
	       try {
	    	   if(isEmpty())
	    		   throw new Myexception("Already Empty Not Been Deleted Please Insert Elements First ....");
	    	   Node ptr = front;
	    	   front = ptr.getNext();
	    	    if(front==null)
	    	    	 rear = null;
	    	     size--;
	    	     System.out.println("Deleted Element :"+ptr.getData());
				return ptr;
	    	       
	       
	       }catch(Myexception ex){
	    	    System.out.println(ex.getMessage());
	       }
		return front;
	    	   
	    	  	   	
     }    
	    
	    public void size() {
	    	System.out.println("Total Size :"+size);
	    	
	    }
	    
	    public void display() {
	    	try {
	    	if(front == null && rear == null )
	    		throw new Myexception("Queue is Already Empty ....");
	    	else {
	    		Node ptr= front;
	    		System.out.print("Elements in Queue :");
	    		while(ptr!=rear.getNext()) {
	    			System.out.print(ptr.getData()+"  ");
	    			ptr = ptr.getNext();
	    		}
	    		System.out.println();
	    	}
	    }catch(Myexception ex) {
	    	System.out.println(ex.getMessage());
	    }
	    	
	    }
}

