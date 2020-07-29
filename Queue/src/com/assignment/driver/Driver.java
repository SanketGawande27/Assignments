package com.assignment.driver;

import java.util.Scanner;

import com.assignment.customexpection.MyException;
import com.assignment.queue.service.impl.Myqueue;

public class Driver {

	public static <E> void main(String[] args) throws MyException {
		MyException ex = new MyException(null);
		Scanner scanner = new Scanner(System.in);
		Myqueue<E> myq = new Myqueue<E>();
		while (true) {
			System.out.print(
					"\n*******************************************\nPress \n1 for insert \n2 for Delete \n3 for Display \n4 for Size \n");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter new element: ");
				myq.insert();
				break;

			case 2:
				try {
					System.out.print("Deleted Element: " + myq.delete());
				} catch (MyException ex1) {
					System.out.print(ex1.getMessage());
				}
				break;

			case 3:
				System.out.println(myq);
				break;

			case 4:
				System.out.print("Total Size :" + myq.size());
				break;

			default:
				System.out.println("Input in wrong... \nEnter Correct Input.....! ");

			}

		}

	}

}
