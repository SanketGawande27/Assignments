package com.assignment.driver;
import java.util.Scanner;

import com.assignment.queue.service.impl.Myqueue;
public class Driver {

	public static void main(String[] args) {
		Myqueue myq = new Myqueue();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("*******************************************\nPress \n1 for insert \n2 for Delete \n3 for Display \n4 for Size \n ");
		int choice = scanner.nextInt();
		switch(choice) {
		
		case 1:myq.insert();
		break;
		
		case 2:myq.delete();
		break;
		
		case 3:myq.display();
		break;
		
		case 4:myq.size();
		break;
		
		default:
			System.out.println("Input in wrong...  Enter Correct Input.....! ");
		
		 } 
		
		}

	}

	
}
