package com.assignment.queue.service.impl;
import java.util.Scanner;

import com.assignment.customexceptions.MyException;
import com.assignment.node.Node;

public class Myqueue {
   
	 private Node rear;
	 private Node front;
	 private int size;	
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
	    
	    
	@Override
	 public String toString() {
	     	  String result = "";
                  Node ptr = front;
                  while(ptr != null){
                  result += ptr.getData();
                  if(ptr.getNext() != null){
                     result += ", ";
                   }
                     ptr = ptr.getNext();
                  }
                  if(result=="")
            	  return "Queue is Empty ...! ";
            
                  return "Elements in Queue " + result;
		}
	     
 }
